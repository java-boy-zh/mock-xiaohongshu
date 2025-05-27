package io.github.zh.log.config;

import io.github.zh.log.aspect.ApiOperationLogAspect;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.context.annotation.Bean;

/**
 * ApiOperationLogAutoConfiguration
 *
 * @author 王青玄
 * @version v0.1 2025-05-27 11:36
 */
@AutoConfiguration
public class ApiOperationLogAutoConfiguration {

    @Bean
    public ApiOperationLogAspect apiOperationLogAspect() {
        return new ApiOperationLogAspect();
    }
}