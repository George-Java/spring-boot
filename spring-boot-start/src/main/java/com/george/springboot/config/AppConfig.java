package com.george.springboot.config;

/*
 *ClassName: AppConfig
 *Package：com.george.springboot.config
 *Description：
 *@Author: George
 *@CreationDate: 2026-04-27-19:43
 *@Version 1.0
 */

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
/*
* @ConfigurationProperties实现将配置文件(例如application.yml)中的属性值一次性绑定到Bean对象属性上
* 替代
*   @Value("${spring.datasource.driver-class-name}")
    private String driver;
    @Value("${spring.datasource.url}")
    private String url;
    @Value("${spring.datasource.username}")
    private String username;
    @Value("${spring.datasource.password}")
    private String password;
*/
@ConfigurationProperties(prefix = "spring.datasource")
public class AppConfig {
    @Value("${spring.datasource.driver-class-name}")
    private String driver;
    private String url;
    private String username;
    private String password;
    private String type;


    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void printInfo() {
        System.out.println("driver:" + driver + "\nurl:" + url +
                "\nusername:" + username + "\npassword:" + password
                + "\ntype:" + type);
    }
}
