package io.github.zh.oss.biz.config.aliyun;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author 王青玄
 * @Contact 1121586359@qq.com
 * @create 2025年06月01日 19:00
 * @description: 阿里云 OSS 配置项
 */
@ConfigurationProperties(prefix = "storage.aliyun-oss")
@Component
@Data
public class AliyunOSSProperties {
    private String endpoint;
    private String accessKey;
    private String secretKey;
}
