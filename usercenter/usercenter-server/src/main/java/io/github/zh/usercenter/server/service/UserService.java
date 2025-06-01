package io.github.zh.usercenter.server.service;

import io.github.zh.common.resopnse.Response;
import io.github.zh.usercenter.server.domain.vo.user.UpdateUserInfoReqVO;

/**
 * @author 王青玄
 * @Contact 1121586359@qq.com
 * @create 2025年06月01日 21:52
 * @description: 用户业务
 */
public interface UserService {

    /**
     * 更新用户信息
     *
     * @param updateUserInfoReqVO
     * @return
     */
    Response<?> updateUserInfo(UpdateUserInfoReqVO updateUserInfoReqVO);
}
