package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author qianyu
 * @title
 * @Package com.example.demo.controller
 * @date 2022/2/10 15:46
 */
@RestController
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping(path = "/login", method = RequestMethod.GET)
    public String login(String username, String password) {
        User user = userMapper.selectByUsernameAndPassword(username, password);
        if (user == null) {
            return "failed";
        }
        return "success";
    }

}
