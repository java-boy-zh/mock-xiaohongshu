package io.github.zh.auth.domain.vo.verificationcode;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * SendVerificationCodeReqVO
 *
 * @author 王青玄
 * @version v0.1 2025-05-29 11:06
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SendVerificationCodeReqVO {

    @NotBlank(message = "手机号不能为空")
    private String phone;

}