package io.github.zh.userrelation.server.domain.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * FindFollowingUserRspVO
 *
 * @author 王青玄
 * @version v0.1 2025-06-26 10:08
 * @description: 查询关注列表
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FindFollowingUserRspVO {

    private Long userId;

    private String avatar;

    private String nickname;

    private String introduction;

}