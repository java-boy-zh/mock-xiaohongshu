package io.github.zh.usercenter.api.dto.req;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * FindUserByIdReqDTO
 *
 * @author 王青玄
 * @version v0.1 2025-06-19 14:36
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FindUserByIdReqDTO {

    /**
     * 手机号
     */
    @NotNull(message = "用户 ID 不能为空")
    private Long id;

}