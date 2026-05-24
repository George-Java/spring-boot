package com.george.springboot.controller;

import com.george.springboot.entity.User;
import com.george.springboot.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/page")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/userpage/{pageNum}/{pageSize}")
    public PageInfo<User> userPage(@PathVariable Integer pageNum, @PathVariable Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);

        List<User> users = userService.selectAll();

        return new PageInfo<>(users);
    }
}
