package io.github.zh.count.server.config;

import org.apache.rocketmq.spring.autoconfigure.RocketMQAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * RocketMQConfig
 *
 * @author 王青玄
 * @version v0.1 2025-06-26 10:57
 */
@Configuration
@Import(RocketMQAutoConfiguration.class)
public class RocketMQConfig {
}