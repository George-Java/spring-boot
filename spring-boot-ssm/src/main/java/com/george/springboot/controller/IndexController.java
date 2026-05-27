package com.george.springboot.controller;

import com.george.springboot.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/")
public class IndexController {
    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/index")
    public String index1() {
        return "index";
    }

    @ResponseBody
    @GetMapping("/index.html")
    public User index2() {
        return new User(1, "张三", "root", "123456");
    }

    @ResponseBody
    @PostMapping("/api/user")
    public List<User> addUsers(@RequestBody List<User> users) {
        for (User user : users) {
            System.out.println(user);
        }
        return users;
    }
}
