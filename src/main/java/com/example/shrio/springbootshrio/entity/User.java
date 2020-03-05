package com.example.shrio.springbootshrio.entity;

import lombok.Data;

import java.util.Set;

/**
 * @description: 用户
 * @author: qingyang
 * @create: 2020-03-04 16:57
 **/
@Data
public class User {

    private String id;

    private String userName;

    private String password;
    private Set<Role> roles;

    public User(String id, String userName, String password, Set<Role> roles) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.roles = roles;
    }
}
