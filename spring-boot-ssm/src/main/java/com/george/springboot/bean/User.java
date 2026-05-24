package com.george.springboot.bean;

import lombok.*;

/*
@Data注解相当于：
@Setter
@Getter
@ToString
@EqualsAndHashCode
@RequiredArgsConstructor
*/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private Integer id;
    private String name;
    private String accountName;
    private String password;
}
