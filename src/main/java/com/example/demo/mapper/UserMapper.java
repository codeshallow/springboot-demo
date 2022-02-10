package com.example.demo.mapper;

import com.example.demo.entity.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @author qianyu
 * @title
 * @Package com.example.demo.mapper
 * @date 2022/2/10 15:37
 */
public interface UserMapper {

    @Select("select * from user where username = #{username} and password = #{password}")
    User selectByUsernameAndPassword(@Param("username") String username, @Param("password") String password);
}
