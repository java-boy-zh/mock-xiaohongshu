package io.github.zh.usercenter.api.dto.req;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * UpdateUserPasswordReqDTO
 *
 * @author 王青玄
 * @version v0.1 2025-06-11 13:20
 * @description: 密码更新
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UpdateUserPasswordReqDTO {

    @NotBlank(message = "密码不能为空")
    private String encodePassword;

}