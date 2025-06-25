package io.github.zh.userrelation.server.config;

import org.apache.rocketmq.spring.autoconfigure.RocketMQAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * RocketMQConfig
 *
 * @author 王青玄
 * @version v0.1 2025-06-25 17:43
 */
@Configuration
@Import(RocketMQAutoConfiguration.class)
public class RocketMQConfig {
}