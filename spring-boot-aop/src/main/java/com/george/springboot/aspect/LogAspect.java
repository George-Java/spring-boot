package com.george.springboot.aspect;

/*
 *ClassName: LogAspect
 *Package：com.george.springboot.aspect
 *Description：
 *@Author: George
 *@CreationDate: 2026-04-28-14:06
 *@Version 1.0
 */

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Slf4j
public class LogAspect {
    @Pointcut("execution(* com.george.springboot.service..*(..))")
    public void ServiceMethod() {
    }

    @Before("ServiceMethod()")
    public void printLogBefore() {
        log.info("调试信息Before");
    }

    @AfterReturning("ServiceMethod()")
    public void printLogAfterReturning() {
        log.info("调试信息AfterReturning");
    }
}
