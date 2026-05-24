package com.george.springboot.handler;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

//@RestControllerAdvice+@ExceptionHandler定义全局异常处理器
@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {
    @ExceptionHandler(NullPointerException.class)
    public String NullPointerExceptionHandler(NullPointerException e) {
        log.warn(e.getMessage());
        return "错误信息:" + e.getMessage();
    }
}
