package com.hylzbb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.hylzbb.mapper")
public class LibrarySpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(LibrarySpringbootApplication.class, args);
    }

}
