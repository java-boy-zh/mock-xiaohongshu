package io.github.zh.context.config;

import io.github.zh.context.interceptor.FeignRequestInterceptor;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.context.annotation.Bean;

/**
 * @author 王青玄
 * @Contact 1121586359@qq.com
 * @create 2025年06月02日 10:10
 * @description: Feign 请求拦截器自动配置
 */
@AutoConfiguration
public class FeignContextAutoConfiguration {

    @Bean
    public FeignRequestInterceptor feignRequestInterceptor() {
        return new FeignRequestInterceptor();
    }
}
