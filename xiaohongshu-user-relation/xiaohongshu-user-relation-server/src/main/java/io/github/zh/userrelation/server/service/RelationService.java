package io.github.zh.userrelation.server.service;

import io.github.zh.common.resopnse.PageResponse;
import io.github.zh.common.resopnse.Response;
import io.github.zh.userrelation.server.domain.vo.FindFollowingListReqVO;
import io.github.zh.userrelation.server.domain.vo.FindFollowingUserRspVO;
import io.github.zh.userrelation.server.domain.vo.FollowUserReqVO;
import io.github.zh.userrelation.server.domain.vo.UnfollowUserReqVO;

/**
 * RelationService
 *
 * @author 王青玄
 * @version v0.1 2025-06-25 15:32
 * @description: 关注业务
 */
public interface RelationService {
    /**
     * 关注用户
     * @param followUserReqVO
     * @return
     */
    Response<?> follow(FollowUserReqVO followUserReqVO);

    /**
     * 取关用户
     * @param unfollowUserReqVO
     * @return
     */
    Response<?> unfollow(UnfollowUserReqVO unfollowUserReqVO);

    /**
     * 查询关注列表
     * @param findFollowingListReqVO
     * @return
     */
    PageResponse<FindFollowingUserRspVO> findFollowingList(FindFollowingListReqVO findFollowingListReqVO);

}