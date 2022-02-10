package com.example.demo.entity;

import lombok.Data;

/**
 * @author qianyu
 * @title
 * @Package com.example.demo.entity
 * @date 2022/2/10 15:33
 */
@Data
public class User {
    private Integer id;
    private String username;
    private String nickname;
    private String password;
}
