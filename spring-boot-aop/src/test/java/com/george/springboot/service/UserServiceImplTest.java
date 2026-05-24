package com.george.springboot.service;

/*
 *ClassName: UserServiceImplTest
 *Package：com.george.springboot.service
 *Description：
 *@Author: George
 *@CreationDate: 2026-04-28-14:17
 *@Version 1.0
 */

import com.george.springboot.service.impl.UserServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UserServiceImplTest {
    @Autowired
    private UserServiceImpl userService;

    @Test
    void testSave() {
        userService.save(1, "testInfo");
    }
}
