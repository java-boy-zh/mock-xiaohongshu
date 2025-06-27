package io.github.zh.search.service;

import io.github.zh.common.resopnse.PageResponse;
import io.github.zh.search.domain.vo.req.SearchUserReqVO;
import io.github.zh.search.domain.vo.resp.SearchUserRspVO;

/**
 * UserService
 *
 * @author 王青玄
 * @version v0.1 2025-06-27 17:01
 * @description: 用户搜索业务
 */
public interface UserService {

    /**
     * 搜索用户
     * @param searchUserReqVO
     * @return
     */
    PageResponse<SearchUserRspVO> searchUser(SearchUserReqVO searchUserReqVO);
}