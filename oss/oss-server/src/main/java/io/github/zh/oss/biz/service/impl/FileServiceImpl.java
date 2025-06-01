package io.github.zh.oss.biz.service.impl;

import io.github.zh.common.resopnse.Response;
import io.github.zh.oss.biz.service.FileService;
import io.github.zh.oss.biz.strategy.FileStrategy;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author 王青玄
 * @Contact 1121586359@qq.com
 * @create 2025年06月01日 17:55
 */
@Service
@Slf4j
public class FileServiceImpl implements FileService {

    @Resource
    private FileStrategy fileStrategy;

    @Override
    public Response<?> uploadFile(MultipartFile file) {
        // 上传文件到
        fileStrategy.uploadFile(file, "xiaohongshu");

        return Response.success();
    }
}
