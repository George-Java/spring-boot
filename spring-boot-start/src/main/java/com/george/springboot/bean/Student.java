package com.george.springboot.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;

/*
 *ClassName: Student
 *Package：com.george.springboot.bean
 *Description：
 *@Author: George
 *@CreationDate: 2026-04-28-13:24
 *@Version 1.0
 */


@ConfigurationProperties(prefix = "user")
public class Student {
    private Integer age;
    private Double height;
    private Score score;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Score getScore() {
        return score;
    }

    public void setScore(Score score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", height=" + height +
                ", score=" + score +
                '}';
    }
}
