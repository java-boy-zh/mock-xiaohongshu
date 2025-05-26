package io.github.zh.auth.controller;

import io.github.zh.common.resopnse.Response;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test")
    public Response<String> test() {
        return Response.success("Hello, 这是测试返回");
    }
}
