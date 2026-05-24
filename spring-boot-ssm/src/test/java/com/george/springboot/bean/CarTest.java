package com.george.springboot.bean;

/*
 *ClassName: CarTest
 *Package：com.george.springboot.bean
 *Description：
 *@Author: George
 *@CreationDate: 2026-04-28-15:58
 *@Version 1.0
 */

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CarTest {
    @Test
    void test() {
        Car car = Car.builder()
                .brand("大众")
                .color("黑")
                .addAccessory("车灯")
                .addAccessory("轮胎")
                .addAccessory("方向盘")
                .build();

        System.out.println(car);
    }
}
