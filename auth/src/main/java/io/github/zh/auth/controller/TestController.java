package io.github.zh.auth.controller;

import io.github.zh.common.resopnse.Response;
import io.github.zh.log.aspect.ApiOperationLog;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test")
    public Response<String> test() {
        return Response.success("Hello, 这是测试返回");
    }

    @GetMapping("/test2")
    @ApiOperationLog
    public Response<String> test2() {
        return Response.success("Hello, 这是测试返回");
    }
}
