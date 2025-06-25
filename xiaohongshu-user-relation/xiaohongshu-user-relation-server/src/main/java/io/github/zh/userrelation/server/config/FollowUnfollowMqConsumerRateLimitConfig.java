package io.github.zh.userrelation.server.config;

import com.google.common.util.concurrent.RateLimiter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * FollowUnfollowMqConsumerRateLimitConfig
 *
 * @author 王青玄
 * @version v0.1 2025-06-25 17:58
 * @description: 关注、取关消费者令牌桶配置类
 */
@Configuration
@RefreshScope
public class FollowUnfollowMqConsumerRateLimitConfig {

    @Value("${mq-consumer.follow-unfollow.rate-limit}")
    private double rateLimit;

    @Bean
    @RefreshScope
    public RateLimiter rateLimiter() {
        return RateLimiter.create(rateLimit);
    }
}