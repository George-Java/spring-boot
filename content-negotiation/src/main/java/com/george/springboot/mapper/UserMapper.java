package com.george.springboot.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.george.springboot.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {
}
