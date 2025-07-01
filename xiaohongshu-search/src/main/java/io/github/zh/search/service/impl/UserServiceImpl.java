package io.github.zh.search.service.impl;

import cn.hutool.core.collection.CollectionUtil;
import com.google.common.collect.Lists;
import io.github.zh.common.resopnse.PageResponse;
import io.github.zh.search.domain.vo.req.SearchUserReqVO;
import io.github.zh.search.domain.vo.resp.SearchUserRspVO;
import io.github.zh.search.index.UserIndex;
import io.github.zh.search.service.UserService;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.elasticsearch.action.search.SearchRequest;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.SearchHit;
import org.elasticsearch.search.SearchHits;
import org.elasticsearch.search.builder.SearchSourceBuilder;
import org.elasticsearch.search.fetch.subphase.highlight.HighlightBuilder;
import org.elasticsearch.search.sort.FieldSortBuilder;
import org.elasticsearch.search.sort.SortBuilder;
import org.elasticsearch.search.sort.SortOrder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * UserServiceImpl
 *
 * @author 王青玄
 * @version v0.1 2025-06-27 17:02
 * @description: 用户搜索业务
 */
@Service
@Slf4j
public class UserServiceImpl implements UserService {

    @Resource
    private RestHighLevelClient restHighLevelClient;

    /**
     * 搜索用户
     *
     * @param searchUserReqVO
     * @return
     */
    @Override
    public PageResponse<SearchUserRspVO> searchUser(SearchUserReqVO searchUserReqVO) {
        // 查询关键词
        String keyword = searchUserReqVO.getKeyword();
        // 当前页码
        Integer pageNo = searchUserReqVO.getPageNo();

        // 构建 SearchRequest，指定索引
        SearchRequest searchRequest = new SearchRequest(UserIndex.NAME);

        // 构建查询内容
        SearchSourceBuilder sourceBuilder = new SearchSourceBuilder();

        // 构建 multi_match 查询，查询 nickname 和 xiaohongshu_id 字段
        sourceBuilder.query(QueryBuilders.multiMatchQuery(
                keyword, UserIndex.FIELD_USER_NICKNAME, UserIndex.FIELD_USER_XIAOHONGSHU_ID));

        // 排序，按 fans_total 降序
        SortBuilder<?> sortBuilder = new FieldSortBuilder(UserIndex.FIELD_USER_FANS_TOTAL)
                .order(SortOrder.DESC);
        sourceBuilder.sort(sortBuilder);

        // 设置分页，from 和 size
        int pageSize = 10; // 每页展示数据量
        int from = (pageNo - 1) * pageSize; // 偏移量

        sourceBuilder.from(from);
        sourceBuilder.size(pageSize);

        // 设置高亮字段
        HighlightBuilder highlightBuilder = new HighlightBuilder();
        highlightBuilder.field(UserIndex.FIELD_USER_NICKNAME)
                .preTags("<strong>") // 设置包裹标签
                .postTags("</strong>");
        sourceBuilder.highlighter(highlightBuilder);

        // 将构建的查询条件设置到 SearchRequest 中
        searchRequest.source(sourceBuilder);

        // 返参 VO 集合
        List<SearchUserRspVO> searchUserRspVOS = null;
        // 总文档数，默认为 0
        long total = 0;
        try {
            log.info("==> SearchRequest: {}", searchRequest);

            // 执行查询请求
            SearchResponse searchResponse = restHighLevelClient.search(searchRequest, RequestOptions.DEFAULT);

            // 处理搜索结果
            total = searchResponse.getHits().getTotalHits().value;
            log.info("==> 命中文档总数, hits: {}", total);

            searchUserRspVOS = Lists.newArrayList();

            // 获取搜索命中的文档列表
            SearchHits hits = searchResponse.getHits();

            for (SearchHit hit : hits) {
                log.info("==> 文档数据: {}", hit.getSourceAsString());

                // 获取文档的所有字段（以 Map 的形式返回）
                Map<String, Object> sourceAsMap = hit.getSourceAsMap();

                // 提取特定字段值
                Long userId = ((Number) sourceAsMap.get(UserIndex.FIELD_USER_ID)).longValue();
                String nickname = (String) sourceAsMap.get(UserIndex.FIELD_USER_NICKNAME);
                String avatar = (String) sourceAsMap.get(UserIndex.FIELD_USER_AVATAR);
                String xiaohongshuId = (String) sourceAsMap.get(UserIndex.FIELD_USER_XIAOHONGSHU_ID);
                Integer noteTotal = (Integer) sourceAsMap.get(UserIndex.FIELD_USER_NOTE_TOTAL);
                Integer fansTotal = (Integer) sourceAsMap.get(UserIndex.FIELD_USER_FANS_TOTAL);

                // 获取高亮字段
                String highlightedNickname = null;
                if (CollectionUtil.isNotEmpty(hit.getHighlightFields())
                        && hit.getHighlightFields().containsKey(UserIndex.FIELD_USER_NICKNAME)) {
                    highlightedNickname = hit.getHighlightFields().get(UserIndex.FIELD_USER_NICKNAME).fragments()[0].string();
                }

                // 构建 VO 实体类
                SearchUserRspVO searchUserRspVO = SearchUserRspVO.builder()
                        .userId(userId)
                        .nickname(nickname)
                        .avatar(avatar)
                        .xiaohongshuId(xiaohongshuId)
                        .noteTotal(noteTotal)
                        .fansTotal(fansTotal)
                        .highlightNickname(highlightedNickname)
                        .build();
                searchUserRspVOS.add(searchUserRspVO);
            }
        } catch (Exception e) {
            log.error("==> 查询 Elasticserach 异常: ", e);
        }

        return PageResponse.success(searchUserRspVOS, pageNo, total);
    }
}