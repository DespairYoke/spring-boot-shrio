package com.example.shrio.springbootshrio.entity;

import lombok.Data;

import java.util.Set;

/**
 * @description: 角色对象
 * @author: qingyang
 * @create: 2020-03-04 17:24
 **/
@Data
public class Role {

    private String id;
    private String roleName;
    /**
     * 角色对应权限集合
     */
    private Set<Permissions> permissions;

    public Role(String id, String roleName, Set<Permissions> permissions) {
        this.id=id;
        this.roleName = roleName;

        this.permissions = permissions;
    }
}
