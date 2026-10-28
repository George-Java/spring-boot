package com.george.springboot.controller;

import com.george.springboot.entity.User;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class TestController {
    @GetMapping("/{item:[a-z]+}/a?/**/*.do")
    public String index(@PathVariable String item, HttpServletRequest request) {
        return request.getRequestURI() + "\nitem:" + item;
    }

    @GetMapping("/yaml")
    public User yaml() {
        return new User(1, "George", "root", "123456");
    }
}
