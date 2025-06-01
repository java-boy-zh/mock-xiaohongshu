package io.github.zh.oss.biz.config.minio;

import io.minio.MinioClient;
import jakarta.annotation.Resource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 王青玄
 * @Contact 1121586359@qq.com
 * @create 2025年06月01日 18:46
 */
@Configuration
public class MinioConfig {

    @Resource
    private MinioProperties minioProperties;

    @Bean
    public MinioClient minioClient() {
        // 构建 Minio 客户端
        return MinioClient.builder()
                .endpoint(minioProperties.getEndpoint())
                .credentials(minioProperties.getAccessKey(), minioProperties.getSecretKey())
                .build();
    }
}
