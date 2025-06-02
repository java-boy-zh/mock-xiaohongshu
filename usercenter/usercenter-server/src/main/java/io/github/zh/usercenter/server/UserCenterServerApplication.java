package io.github.zh.usercenter.server;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author 王青玄
 * @Contact 1121586359@qq.com
 * @create 2025年06月01日 20:04
 */
@SpringBootApplication
@MapperScan("io.github.zh.usercenter.server.mapper")
@EnableFeignClients(basePackages =  "io.github.zh")
public class UserCenterServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserCenterServerApplication.class, args);
    }
}
