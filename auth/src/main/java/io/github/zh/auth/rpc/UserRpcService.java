package io.github.zh.auth.rpc;

import io.github.zh.common.resopnse.Response;
import io.github.zh.usercenter.api.api.UserFeignApi;
import io.github.zh.usercenter.api.dto.req.RegisterUserReqDTO;
import io.github.zh.usercenter.api.dto.req.UpdateUserPasswordReqDTO;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Component;

/**
 * UserRpcService
 *
 * @author 王青玄
 * @version v0.1 2025-06-05 11:19
 * @description: 用户服务
 */
@Component
public class UserRpcService {

    @Resource
    private UserFeignApi userFeignApi;

    /**
     * 用户注册
     *
     * @param phone
     * @return
     */
    public Long registerUser(String phone) {
        RegisterUserReqDTO registerUserReqDTO = new RegisterUserReqDTO();
        registerUserReqDTO.setPhone(phone);

        Response<Long> response = userFeignApi.registerUser(registerUserReqDTO);

        if (!response.isSuccess()) {
            return null;
        }

        return response.getData();
    }

    /**
     * 密码更新
     *
     * @param encodePassword
     */
    public void updatePassword(String encodePassword) {
        UpdateUserPasswordReqDTO updateUserPasswordReqDTO = new UpdateUserPasswordReqDTO();
        updateUserPasswordReqDTO.setEncodePassword(encodePassword);

        userFeignApi.updatePassword(updateUserPasswordReqDTO);
    }

}
