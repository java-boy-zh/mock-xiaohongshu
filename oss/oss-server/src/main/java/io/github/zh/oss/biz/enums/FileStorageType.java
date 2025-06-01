package io.github.zh.oss.biz.enums;

import lombok.Getter;

/**
 * @author 王青玄
 * @Contact 1121586359@qq.com
 * @create 2025年06月01日 17:59
 */
@Getter
public enum FileStorageType {
    MINIO("minio", "MinIO对象存储"),
    ALIYUN("aliyun", "阿里云OSS存储");

    private final String code;
    private final String description;

    FileStorageType(String code, String description) {
        this.code = code;
        this.description = description;
    }

    public static FileStorageType fromCode(String code) {
        for (FileStorageType type : values()) {
            if (type.code.equals(code)) {
                return type;
            }
        }
        throw new IllegalArgumentException("未知存储类型: " + code);
    }
}

