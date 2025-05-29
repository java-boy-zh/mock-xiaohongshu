package io.github.zh.auth.controller;

import cn.dev33.satoken.stp.StpUtil;
import io.github.zh.auth.domain.dataobject.UserDO;
import io.github.zh.common.resopnse.Response;
import io.github.zh.log.aspect.ApiOperationLog;
import org.springframework.web.bind.annotation.*;

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

    // 测试登录，浏览器访问： http://localhost:8080/user/doLogin?username=zhang&password=123456
    @RequestMapping("/user/doLogin")
    public String doLogin(String username, String password) {
        // 此处仅作模拟示例，真实项目需要从数据库中查询数据进行比对
        if("zhang".equals(username) && "123456".equals(password)) {
            StpUtil.login(10001);
            return "登录成功";
        }
        return "登录失败";
    }

    // 查询登录状态，浏览器访问： http://localhost:8080/user/isLogin
    @RequestMapping("/user/isLogin")
    public String isLogin() {
        return "当前会话是否登录：" + StpUtil.isLogin();
    }
}
