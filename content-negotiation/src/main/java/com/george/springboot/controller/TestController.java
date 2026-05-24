package com.george.springboot.controller;

import com.george.springboot.entity.User;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 *ClassName: TestController
 *Package：com.george.springboot.controller
 *Description：
 *@Author: George
 *@CreationDate: 2026-05-09-20:31
 *@Version 1.0
 */
@RestController
@RequestMapping("/")
public class TestController {
    @GetMapping("/{item:[a-z]+}/a?/**/*.do")
    public String index(@PathVariable String item, HttpServletRequest request) {
        return request.getRequestURI() + "\nitem:" + item;
    }

    @GetMapping("/yaml")
    public User yaml() {
        return new User("root", "123456");
    }
}
