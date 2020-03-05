package com.example.shrio.springbootshrio.entity;

import lombok.Data;

/**
 * @description:
 * @author: qingyang
 * @create: 2020-03-04 17:24
 **/
@Data
public class Permissions {

    private String id;
    private String permissionsName;

    public Permissions(String id, String permissionsName) {
        this.id = id;
        this.permissionsName = permissionsName;
    }
}
