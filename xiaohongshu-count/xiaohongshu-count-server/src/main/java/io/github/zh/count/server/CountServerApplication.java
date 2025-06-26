package io.github.zh.count.server;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * CountServerApplication
 *
 * @author 王青玄
 * @version v0.1 2025-06-26 10:49
 */
@SpringBootApplication
@MapperScan("io.github.zh.count.server.mapper")
public class CountServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(CountServerApplication.class, args);
    }
}