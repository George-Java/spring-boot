package com.george.springboot.configuration;

import com.george.springboot.converter.YAMLHttpMessageConverter;
import com.george.springboot.entity.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.AbstractHttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/*
 *ClassName: WebConfigure
 *Package：com.george.springboot.configuration
 *Description：
 *@Author: George
 *@CreationDate: 2026-05-09-21:20
 *@Version 1.0
 */
@Configuration
public class WebConfigure implements WebMvcConfigurer {
    @Bean
    public AbstractHttpMessageConverter<User> messageConverters() {
        return new YAMLHttpMessageConverter();
    }
}
