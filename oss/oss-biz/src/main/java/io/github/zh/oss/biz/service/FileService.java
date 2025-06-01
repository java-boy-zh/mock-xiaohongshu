package io.github.zh.oss.biz.service;

import io.github.zh.common.resopnse.Response;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author 王青玄
 * @Contact 1121586359@qq.com
 * @create 2025年06月01日 17:54
 */
public interface FileService {

    /**
     * 上传文件
     *
     * @param file
     * @return
     */
    Response<?> uploadFile(MultipartFile file);
}
