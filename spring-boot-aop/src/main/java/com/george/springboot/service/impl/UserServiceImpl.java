package com.george.springboot.service.impl;

import com.george.springboot.service.UserService;
import org.springframework.stereotype.Service;

/*
 *ClassName: UserServiceImpl
 *Package：com.george.springboot.service.impl
 *Description：
 *@Author: George
 *@CreationDate: 2026-04-28-14:15
 *@Version 1.0
 */

@Service
public class UserServiceImpl implements UserService {
    @Override
    public void save(int id, String name) {
        System.out.println("用户保存成功");
    }
}
