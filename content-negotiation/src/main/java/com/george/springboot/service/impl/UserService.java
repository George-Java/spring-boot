package com.george.springboot.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.george.springboot.entity.User;
import com.george.springboot.mapper.UserMapper;
import com.george.springboot.service.IUserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(rollbackFor = Exception.class, isolation = Isolation.REPEATABLE_READ)
public class UserService extends ServiceImpl<UserMapper, User> implements IUserService {
}