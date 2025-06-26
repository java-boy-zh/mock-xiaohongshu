package io.github.zh.usercenter.server.service;

import io.github.zh.common.resopnse.Response;
import io.github.zh.usercenter.api.dto.req.FindUserByIdReqDTO;
import io.github.zh.usercenter.api.dto.req.FindUsersByIdsReqDTO;
import io.github.zh.usercenter.api.dto.req.RegisterUserReqDTO;
import io.github.zh.usercenter.api.dto.req.UpdateUserPasswordReqDTO;
import io.github.zh.usercenter.api.dto.resp.FindUserByIdRspDTO;
import io.github.zh.usercenter.server.domain.vo.user.UpdateUserInfoReqVO;

import java.util.List;

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

    /**
     * 用户注册
     *
     * @param registerUserReqDTO
     * @return
     */
    Response<Long> register(RegisterUserReqDTO registerUserReqDTO);

    /**
     * 更新密码
     *
     * @param updateUserPasswordReqDTO
     * @return
     */
    Response<?> updatePassword(UpdateUserPasswordReqDTO updateUserPasswordReqDTO);

    /**
     * 根据用户 ID 查询用户信息
     *
     * @param findUserByIdReqDTO
     * @return
     */
    Response<FindUserByIdRspDTO> findById(FindUserByIdReqDTO findUserByIdReqDTO);

    /**
     * 批量根据用户 ID 查询用户信息
     *
     * @param findUsersByIdsReqDTO
     * @return
     */
    Response<List<FindUserByIdRspDTO>> findByIds(FindUsersByIdsReqDTO findUsersByIdsReqDTO);
}
