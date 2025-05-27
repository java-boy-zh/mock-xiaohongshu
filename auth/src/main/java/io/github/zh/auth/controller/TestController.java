package io.github.zh.auth.controller;

import io.github.zh.auth.domain.dataobject.UserDO;
import io.github.zh.common.resopnse.Response;
import io.github.zh.log.aspect.ApiOperationLog;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test")
    public Response<String> test() {
        return Response.success("Hello, 这是测试返回");
    }

    @PostMapping("/test2")
    @ApiOperationLog(description = "测试接口2")
    public Response<UserDO> test2(@RequestBody UserDO user) {
        return Response.success(user);
    }
}
