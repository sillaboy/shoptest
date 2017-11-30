package com.silly.shop.service;

import com.silly.shop.mapper.user.UserDao;
import com.silly.shop.mapper.user.UserMapper;
import com.silly.shop.model.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;

/**
 * Created by yunlong.zhang on 2017/11/7.
 */
@Service
public class UserService {
    @Autowired
    private UserDao userDao;
    @Autowired
    private UserMapper userMapper;
    public User findUserById(String id) {
        User user = null;
        try {
            user = userDao.getUserById(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return user;
    }


    public User getUser(String id) {
        User user = null;
        try {
            user = userMapper.getUserfromId(id);
            String psw = user.getPsw() + "?";
            user.setPsw(psw);
            userMapper.updatePswFromId(id, user.getEmail(), psw);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return user;
    }
}
