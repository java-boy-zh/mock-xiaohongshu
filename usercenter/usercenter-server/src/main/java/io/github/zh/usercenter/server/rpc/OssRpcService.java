package io.github.zh.usercenter.server.rpc;

import io.github.zh.common.resopnse.Response;
import io.github.zh.oss.api.client.FileFeignApi;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author 王青玄
 * @Contact 1121586359@qq.com
 * @create 2025年06月02日 09:56
 * @description: 对象存储服务调用
 */
@RequiredArgsConstructor
@Slf4j
@Component
public class OssRpcService {

    private final FileFeignApi fileFeignApi;

    public String uploadFile(MultipartFile file) {
        // 调用对象存储服务上传文件
        Response<?> response = fileFeignApi.uploadFile(file);

        if (!response.isSuccess()) {
            return null;
        }

        // 返回图片访问链接
        return (String) response.getData();
    }
}
