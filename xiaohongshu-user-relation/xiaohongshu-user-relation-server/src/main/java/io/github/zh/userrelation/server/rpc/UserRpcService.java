package io.github.zh.userrelation.server.rpc;

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
 * @version v0.1 2025-06-25 15:35
 * @description: 用户服务
 */
@Component
public class UserRpcService {

    @Resource
    private UserFeignApi userFeignApi;

    /**
     * 根据用户 ID 查询
     *
     * @param userId
     * @return
     */
    public FindUserByIdRspDTO findById(Long userId) {
        FindUserByIdReqDTO findUserByIdReqDTO = new FindUserByIdReqDTO();
        findUserByIdReqDTO.setId(userId);

        Response<FindUserByIdRspDTO> response = userFeignApi.findById(findUserByIdReqDTO);

        if (!response.isSuccess() || Objects.isNull(response.getData())) {
            return null;
        }

        return response.getData();
    }


}