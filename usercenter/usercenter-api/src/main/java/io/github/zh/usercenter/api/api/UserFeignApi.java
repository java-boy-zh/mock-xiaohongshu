package io.github.zh.usercenter.api.api;

import io.github.zh.common.resopnse.Response;
import io.github.zh.usercenter.api.constant.ApiConstants;
import io.github.zh.usercenter.api.dto.req.RegisterUserReqDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * UserFeignApi
 *
 * @author 王青玄
 * @version v0.1 2025-06-05 11:10
 */
@FeignClient(name = ApiConstants.SERVICE_NAME)
public interface UserFeignApi {

    String PREFIX = "/user";

    /**
     * 用户注册
     *
     * @param registerUserReqDTO
     * @return
     */
    @PostMapping(value = PREFIX + "/register")
    Response<Long> registerUser(@RequestBody RegisterUserReqDTO registerUserReqDTO);

}