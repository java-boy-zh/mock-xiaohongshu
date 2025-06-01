package io.github.zh.oss.biz.fatory;

import io.github.zh.oss.biz.enums.FileStorageType;
import io.github.zh.oss.biz.strategy.FileStrategy;
import io.github.zh.oss.biz.strategy.impl.AliyunOSSFileStrategy;
import io.github.zh.oss.biz.strategy.impl.MinioFileStrategy;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 王青玄
 * @Contact 1121586359@qq.com
 * @create 2025年06月01日 17:53
 */
@Configuration
public class FileStrategyFactory {

    @Value("${storage.type}")
    private String strategyType;

    @Bean
    public FileStrategy getFileStrategy() {

        FileStorageType fileStorageType = FileStorageType.fromCode(strategyType);

        switch (fileStorageType) {
            case MINIO:
                return new MinioFileStrategy();
            case ALIYUN:
                return new AliyunOSSFileStrategy();
            default:
                throw new IllegalArgumentException("不可用的存储类型");
        }
    }

}
