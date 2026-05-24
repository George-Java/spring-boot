package com.george.springboot.converter;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.george.springboot.entity.User;
import org.jspecify.annotations.NonNull;
import org.jspecify.annotations.Nullable;
import org.springframework.http.HttpInputMessage;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.MediaType;
import org.springframework.http.converter.AbstractHttpMessageConverter;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

/*
 *ClassName: YAMLHttpMessageConverter
 *Package：com.george.springboot.converter
 *Description：
 *@Author: George
 *@CreationDate: 2026-05-09-21:05
 *@Version 1.0
 */
public class YAMLHttpMessageConverter extends AbstractHttpMessageConverter<User> {
    private final ObjectMapper objectMapper = new ObjectMapper(new YAMLFactory());

    //通过构造函数将该消息转换器与媒体类型text/yaml绑定
    public YAMLHttpMessageConverter() {
        super(new MediaType("text", "yaml", StandardCharsets.UTF_8));
    }

    //这个方法用来指定该消息转换器只适合于哪些类型的对象
    @Override
    protected boolean supports(@NonNull Class<?> clazz) {
        return User.class.isAssignableFrom(clazz);
    }

    @Override
    protected @Nullable User readInternal(@NonNull Class<? extends User> clazz, @NonNull HttpInputMessage inputMessage) throws IOException, HttpMessageNotReadableException {
        return null;
    }

    @Override
    protected void writeInternal(@NonNull User user, HttpOutputMessage outputMessage) throws IOException, HttpMessageNotWritableException {
        objectMapper.writeValue(outputMessage.getBody(), user);
    }
}
