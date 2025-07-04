package io.github.zh.userrelation.server.domain.vo;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * FindFansListReqVO
 *
 * @author 王青玄
 * @version v0.1 2025-06-26 10:21
 * @description: 查询粉丝列表
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FindFansListReqVO {

    @NotNull(message = "查询用户 ID 不能为空")
    private Long userId;

    @NotNull(message = "页码不能为空")
    private Integer pageNo = 1; // 默认值为第一页
}