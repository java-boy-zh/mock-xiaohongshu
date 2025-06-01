package io.github.zh.oss.biz.strategy;

import org.springframework.web.multipart.MultipartFile;

/**
 * @author 王青玄
 * @Contact 1121586359@qq.com
 * @create 2025年06月01日 17:39
 * @description: 文件策略接口
 */
public interface FileStrategy {
    /**
     * 文件上传
     *
     * @param file
     * @param bucketName
     * @return
     */
    String uploadFile(MultipartFile file, String bucketName);
}
