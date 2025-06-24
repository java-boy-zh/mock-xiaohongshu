package io.github.zh.note.server.rpc;

import io.github.zh.common.resopnse.Response;
import io.github.zh.usercenter.api.api.UserFeignApi;
import io.github.zh.usercenter.api.dto.req.FindUserByIdReqDTO;
import io.github.zh.usercenter.api.dto.resp.FindUserByIdRspDTO;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Component;

import java.util.Objects;

/**
 * UserRpcService
 *
 * @author 王青玄
 * @version v0.1 2025-06-24 11:29
 * @description: 用户服务
 */
@Component
public class UserRpcService {

    @Resource
    private UserFeignApi userFeignApi;

    /**
     * 查询用户信息
     * @param userId
     * @return
     */
    public FindUserByIdRspDTO findById(Long userId) {
        FindUserByIdReqDTO findUserByIdReqDTO = new FindUserByIdReqDTO();
        findUserByIdReqDTO.setId(userId);

        Response<FindUserByIdRspDTO> response = userFeignApi.findById(findUserByIdReqDTO);

        if (Objects.isNull(response) || !response.isSuccess()) {
            return null;
        }

        return response.getData();
    }

}