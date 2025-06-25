package io.github.zh.userrelation.server.domain.vo;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * FollowUserReqVO
 *
 * @author 王青玄
 * @version v0.1 2025-06-25 15:29
 * @description: 关注用户
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FollowUserReqVO {

    @NotNull(message = "被关注用户 ID 不能为空")
    private Long followUserId;
}