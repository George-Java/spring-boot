package com.george.springboot.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
 *ClassName: User
 *Package：com.george.springboot.entity
 *Description：
 *@Author: George
 *@CreationDate: 2026-05-09-21:06
 *@Version 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private String username;
    private String password;
}
