package com.george.springboot.controller;

import com.george.springboot.entity.User;
import com.george.springboot.service.impl.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/page")
public class UserController {
    private final UserService userService;

    @RequestMapping("/userpage/{pageNum}/{pageSize}")
    public PageInfo<User> userPage(@PathVariable Integer pageNum, @PathVariable Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);

        List<User> users = userService.lambdaQuery().list();

        return new PageInfo<>(users);
    }
}
