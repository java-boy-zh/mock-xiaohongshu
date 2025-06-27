package io.github.zh.search.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * ElasticsearchProperties
 *
 * @author 王青玄
 * @version v0.1 2025-06-27 16:27
 * @description: Elasticsearch 配置项
 */
@ConfigurationProperties(prefix = "elasticsearch")
@Component
@Data
public class ElasticsearchProperties {
    private String address;
}