package com.george.springboot.service;

/*
 *ClassName: UserServiceTest
 *Package：com.george.springboot.service
 *Description：
 *@Author: George
 *@CreationDate: 2026-04-28-15:05
 *@Version 1.0
 */

import com.george.springboot.bean.User;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class UserServiceTest {
    @Resource
    private UserService userService;

    @Test
    void testFindAll() {
        List<User> users = userService.findAll();
        users.forEach(System.out::println);
    }
}
