package io.github.zh.oss.biz.config.minio;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author 王青玄
 * @Contact 1121586359@qq.com
 * @create 2025年06月01日 18:45
 */
@ConfigurationProperties(prefix = "storage.minio")
@Component
@Data
public class MinioProperties {
    private String endpoint;
    private String accessKey;
    private String secretKey;
}
