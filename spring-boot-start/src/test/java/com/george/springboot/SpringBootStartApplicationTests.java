package com.george.springboot;

import com.george.springboot.bean.Student;
import com.george.springboot.config.AppConfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootStartApplicationTests {
    @Autowired
    private AppConfig appConfig;

    @Autowired
    private Student student;

    @Test
    void testAppConfig() {
        appConfig.printInfo();
    }

    @Test
    void testStudent() {
        System.out.println(student);
    }
}
