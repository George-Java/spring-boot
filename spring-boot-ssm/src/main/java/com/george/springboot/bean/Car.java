package com.george.springboot.bean;

/*
 *ClassName: Student
 *Package：com.george.springboot.bean
 *Description：
 *@Author: George
 *@CreationDate: 2026-04-28-15:56
 *@Version 1.0
 */

import lombok.Builder;
import lombok.Data;
import lombok.Singular;

import java.util.List;

@Builder
@Data
public class Car {
    private String brand;
    private Double price;
    private String color;

    //@Singular注解配合@Builder注解使用,用法见CarTest.java
    @Singular("addAccessory")
    private List<String> accessories;
}
