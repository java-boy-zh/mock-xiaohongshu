package io.github.zh.userrelation.server.domain.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * FindFansUserRspVO
 *
 * @author 王青玄
 * @version v0.1 2025-06-26 10:22
 * @description: 查询关注列表
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FindFansUserRspVO {

    /**
     * 用户ID
     */
    private Long userId;

    /**
     * 头像
     */
    private String avatar;

    /**
     * 昵称
     */
    private String nickname;

    /**
     * 粉丝总数
     */
    private Long fansTotal;

    /**
     * 笔记总数
     */
    private Long noteTotal;

}