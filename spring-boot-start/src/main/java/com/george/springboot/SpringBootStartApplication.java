package com.george.springboot;

import com.george.springboot.bean.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ImportResource;

//既是Spring Boot启动类，也是配置类
@SpringBootApplication

//@EnableConfigurationProperties(Student.class)
@ConfigurationPropertiesScan(basePackages = "com.george.springboot")

//@ImportResource()注解可以让较旧的xml文件配置bean的方式生效
@ImportResource("classpath:spring.xml")
public class SpringBootStartApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootStartApplication.class, args);
    }
}