package io.github.zh.count.server.consumer;

import com.github.phantomthief.collection.BufferTrigger;
import com.google.common.collect.Maps;
import io.github.zh.common.util.JsonUtils;
import io.github.zh.count.server.constant.MQConstants;
import io.github.zh.count.server.constant.RedisKeyConstants;
import io.github.zh.count.server.domain.dto.CountFollowUnfollowMqDTO;
import io.github.zh.count.server.enums.FollowUnfollowTypeEnum;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * CountFansConsumer
 *
 * @author 王青玄
 * @version v0.1 2025-06-27 09:33
 * @description: 计数: 粉丝数
 */
@Component
@RocketMQMessageListener(consumerGroup = "xiaohongshu_group_" + MQConstants.TOPIC_COUNT_FANS, // Group 组
        topic = MQConstants.TOPIC_COUNT_FANS // 主题 Topic
)
@Slf4j
public class CountFansConsumer implements RocketMQListener<String> {

    @Resource
    private RedisTemplate<String, Object> redisTemplate;

    private BufferTrigger<String> bufferTrigger = BufferTrigger.<String>batchBlocking()
            .bufferSize(50000) // 缓存队列的最大容量
            .batchSize(1000)   // 一批次最多聚合 1000 条
            .linger(Duration.ofSeconds(1)) // 多久聚合一次
            .setConsumerEx(this::consumeMessage)
            .build();


    @Override
    public void onMessage(String body) {
        // 往 bufferTrigger 中添加元素
        bufferTrigger.enqueue(body);
    }

    private void consumeMessage(List<String> bodys) {
        log.info("==> 聚合消息, size: {}", bodys.size());
        log.info("==> 聚合消息, {}", JsonUtils.toJsonString(bodys));

        // List<String> 转 List<CountFollowUnfollowMqDTO>
        List<CountFollowUnfollowMqDTO> countFollowUnfollowMqDTOS = bodys.stream()
                .map(body -> JsonUtils.parseObject(body, CountFollowUnfollowMqDTO.class)).toList();

        // 按目标用户进行分组
        Map<Long, List<CountFollowUnfollowMqDTO>> groupMap = countFollowUnfollowMqDTOS.stream()
                .collect(Collectors.groupingBy(CountFollowUnfollowMqDTO::getTargetUserId));

        // 按组汇总数据，统计出最终的计数
        // key 为目标用户ID, value 为最终操作的计数
        Map<Long, Integer> countMap = Maps.newHashMap();

        for (Map.Entry<Long, List<CountFollowUnfollowMqDTO>> entry : groupMap.entrySet()) {
            List<CountFollowUnfollowMqDTO> list = entry.getValue();
            // 最终的计数值，默认为 0
            int finalCount = 0;
            for (CountFollowUnfollowMqDTO countFollowUnfollowMqDTO : list) {
                // 获取操作类型
                Integer type = countFollowUnfollowMqDTO.getType();

                // 根据操作类型，获取对应枚举
                FollowUnfollowTypeEnum followUnfollowTypeEnum = FollowUnfollowTypeEnum.valueOf(type);

                // 若枚举为空，跳到下一次循环
                if (Objects.isNull(followUnfollowTypeEnum)) continue;

                switch (followUnfollowTypeEnum) {
                    case FOLLOW -> finalCount += 1; // 如果为关注操作，粉丝数 +1
                    case UNFOLLOW -> finalCount -= 1; // 如果为取关操作，粉丝数 -1
                }
            }
            // 将分组后统计出的最终计数，存入 countMap 中
            countMap.put(entry.getKey(), finalCount);
        }

        log.info("## 聚合后的计数数据: {}", JsonUtils.toJsonString(countMap));

        // 更新 Redis
        countMap.forEach((k, v) -> {
            // Redis Key
            String redisKey = RedisKeyConstants.buildCountUserKey(k);
            // 判断 Redis 中 Hash 是否存在
            boolean isExisted = redisTemplate.hasKey(redisKey);

            // 若存在才会更新
            // (因为缓存设有过期时间，考虑到过期后，缓存会被删除，这里需要判断一下，存在才会去更新，而初始化工作放在查询计数来做)
            if (isExisted) {
                // 对目标用户 Hash 中的粉丝数字段进行计数操作
                redisTemplate.opsForHash().increment(redisKey, RedisKeyConstants.FIELD_FANS_TOTAL, v);
            }
        });

        // TODO: 发送 MQ, 计数数据落库
    }

}