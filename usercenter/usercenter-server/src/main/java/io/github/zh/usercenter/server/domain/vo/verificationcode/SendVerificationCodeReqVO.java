package io.github.zh.usercenter.server.domain.vo.verificationcode;

import io.github.zh.common.validator.PhoneNumber;
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
    @PhoneNumber
    private String phone;

}