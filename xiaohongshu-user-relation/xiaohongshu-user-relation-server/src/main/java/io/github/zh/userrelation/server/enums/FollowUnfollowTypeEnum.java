package io.github.zh.userrelation.server.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * FollowUnfollowTypeEnum
 *
 * @author 王青玄
 * @version v0.1 2025-06-27 09:24
 * @description: 关注、取关 Type
 */
@Getter
@AllArgsConstructor
public enum FollowUnfollowTypeEnum {
    // 关注
    FOLLOW(1),
    // 取关
    UNFOLLOW(0),
    ;

    private final Integer code;

}