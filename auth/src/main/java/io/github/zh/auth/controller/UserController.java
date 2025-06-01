package io.github.zh.auth.controller;

import io.github.zh.auth.domain.vo.user.UserLoginReqVO;
import io.github.zh.auth.service.UserService;
import io.github.zh.common.resopnse.Response;
import io.github.zh.log.aspect.ApiOperationLog;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * UserController
 *
 * @author 王青玄
 * @version v0.1 2025-05-29 16:50
 */
@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {

    @Resource
    private UserService userService;

    @PostMapping("/login")
    @ApiOperationLog(description = "用户登录/注册")
    public Response<String> loginAndRegister(@Validated @RequestBody UserLoginReqVO userLoginReqVO) {
        return userService.loginAndRegister(userLoginReqVO);
    }

    @PostMapping("/logout")
    @ApiOperationLog(description = "账号登出")
    public Response<?> logout(@RequestHeader("userId") String userId) {

        log.info("==> 网关透传过来的用户 ID: {}", userId);

        return Response.success();
    }
}