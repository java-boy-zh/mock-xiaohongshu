package io.github.zh.oss.api.client;

import io.github.zh.common.resopnse.Response;
import io.github.zh.oss.api.constant.ApiConstants;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @author 王青玄
 * @Contact 1121586359@qq.com
 * @create 2025年06月02日 09:42
 */
@FeignClient(name = ApiConstants.SERVICE_NAME)
public interface FileFeignApi {

    String PREFIX = "/file";

    @PostMapping(value = PREFIX + "/test")
    Response<?> test();

}
