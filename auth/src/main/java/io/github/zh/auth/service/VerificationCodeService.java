package io.github.zh.auth.service;

import io.github.zh.auth.domain.vo.verificationcode.SendVerificationCodeReqVO;
import io.github.zh.common.resopnse.Response;

/**
 * VerificationCodeService
 *
 * @author 王青玄
 * @version v0.1 2025-05-29 11:09
 */
public interface VerificationCodeService {
    /**
     * 发送短信验证码
     *
     * @param sendVerificationCodeReqVO
     * @return
     */
    Response<?> send(SendVerificationCodeReqVO sendVerificationCodeReqVO);
}