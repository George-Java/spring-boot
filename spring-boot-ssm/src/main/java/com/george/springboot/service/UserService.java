package com.george.springboot.service;

/*
 *ClassName: UserService
 *Package：com.george.springboot.service
 *Description：
 *@Author: George
 *@CreationDate: 2026-04-28-15:01
 *@Version 1.0
 */

import com.george.springboot.bean.User;
import com.george.springboot.mapper.UserMapper;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Resource
    private UserMapper userMapper;

    public List<User> findAll() {
        return userMapper.findAll();
    }
}
