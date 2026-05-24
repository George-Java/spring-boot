package com.george.springboot.service;

import com.george.springboot.entity.User;
import com.george.springboot.mappers.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class, isolation = Isolation.REPEATABLE_READ)
public class UserService {
    @Autowired
    UserMapper mapper;

    public List<User> selectAll() {
        return mapper.selectAll();
    }
}