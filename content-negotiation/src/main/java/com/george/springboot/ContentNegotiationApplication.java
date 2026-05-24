package com.george.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.george.springboot.mappers")
@SpringBootApplication
public class ContentNegotiationApplication {
    public static void main(String[] args) {
        SpringApplication.run(ContentNegotiationApplication.class, args);
    }
}
