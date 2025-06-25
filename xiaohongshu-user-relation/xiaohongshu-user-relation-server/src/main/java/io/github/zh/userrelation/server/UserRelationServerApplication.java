package io.github.zh.userrelation.server;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * UserRelationServerApplication
 *
 * @author 王青玄
 * @version v0.1 2025-06-24 15:07
 */
@SpringBootApplication
@MapperScan("io.github.zh.userrelation.server.mapper")
@EnableFeignClients(basePackages = "io.github.zh")
public class UserRelationServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserRelationServerApplication.class, args);
    }
}