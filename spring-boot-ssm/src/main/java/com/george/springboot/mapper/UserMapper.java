package com.george.springboot.mapper;

import com.george.springboot.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/*
 *ClassName: UserMapper
 *Package：com.george.springboot.mapper
 *Description：
 *@Author: George
 *@CreationDate: 2026-04-28-14:38
 *@Version 1.0
 */

@Mapper
public interface UserMapper {
    List<User> findAll();

    User findById(Integer id);

    int insertUser(@Param("user") User user);

    int deleteById(Integer id);

    int updateUser(@Param("user") User user);
}
