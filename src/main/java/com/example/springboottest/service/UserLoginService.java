package com.example.springboottest.service;

/**
 * Created by wanglixin
 * 2019/12/17 5:56 PM
 */
import com.example.springboottest.entity.User;
import com.example.springboottest.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserLoginService {

    /**
     * 注入dao
     */
    @Autowired
    private UserMapper usermapper;

    //用户登录
    public User userLogin(String username, String password) {
        User user = usermapper.userlogin(username,password);
        return user;
    }

    //注册新用户
    public int adduser(String username,String password,int age) {
//        return usermapper.adduser(username,password,age);
        return usermapper.adduser1(username,password,age);     //对应sql语句中的第二种注册方式
    }
}
