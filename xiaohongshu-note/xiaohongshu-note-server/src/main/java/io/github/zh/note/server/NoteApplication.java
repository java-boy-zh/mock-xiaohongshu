package io.github.zh.note.server;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author 王青玄
 * @Contact 1121586359@qq.com
 * @create 2025年06月15日 11:33
 */
@SpringBootApplication
@MapperScan("io.github.zh.note.server.mapper")
public class NoteApplication {
    public static void main(String[] args) {
        SpringApplication.run(NoteApplication.class, args);
    }
}
