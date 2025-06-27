package io.github.zh.data.align;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * DataAlignApplication
 *
 * @author 王青玄
 * @version v0.1 2025-06-27 14:23
 */
@SpringBootApplication
@MapperScan("io.github.zh.data.align.mapper")
public class DataAlignApplication {
    public static void main(String[] args) {
        SpringApplication.run(DataAlignApplication.class, args);
    }
}