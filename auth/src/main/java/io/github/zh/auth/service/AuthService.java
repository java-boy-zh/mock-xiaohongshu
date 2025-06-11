package io.github.zh.auth.service;

import io.github.zh.auth.domain.vo.user.UpdatePasswordReqVO;
import io.github.zh.auth.domain.vo.user.UserLoginReqVO;
import io.github.zh.common.resopnse.Response;

/**
 * UserService
 *
 * @author 王青玄
 * @version v0.1 2025-05-29 16:41
 */
public interface AuthService {

    /**
     * 登录与注册
     *
     * @param userLoginReqVO
     * @return
     */
    Response<String> loginAndRegister(UserLoginReqVO userLoginReqVO);

    /**
     * 退出登录
     *
     * @return
     */
    Response<?> logout();

    /**
     * 修改密码
     * @param updatePasswordReqVO
     * @return
     */
    Response<?> updatePassword(UpdatePasswordReqVO updatePasswordReqVO);

}