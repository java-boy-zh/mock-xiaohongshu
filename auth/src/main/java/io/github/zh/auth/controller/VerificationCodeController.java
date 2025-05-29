package io.github.zh.auth.controller;

import io.github.zh.auth.domain.vo.verificationcode.SendVerificationCodeReqVO;
import io.github.zh.auth.service.VerificationCodeService;
import io.github.zh.common.resopnse.Response;
import io.github.zh.log.aspect.ApiOperationLog;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * VerificationCodeController
 *
 * @author 王青玄
 * @version v0.1 2025-05-29 11:16
 */
@RestController
@Slf4j
public class VerificationCodeController {

    @Resource
    private VerificationCodeService verificationCodeService;

    @PostMapping("/verification/code/send")
    @ApiOperationLog(description = "发送短信验证码")
    public Response<?> send(@Validated @RequestBody SendVerificationCodeReqVO sendVerificationCodeReqVO) {
        return verificationCodeService.send(sendVerificationCodeReqVO);
    }

}