package com.silly.shop.service;

import com.silly.shop.mapper.user.UserDao;
import com.silly.shop.model.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by yunlong.zhang on 2017/11/7.
 */
@Service
public class UserService {
    @Autowired
    private UserDao userDao;
    public User findUserById(String id) {
        User user = null;
        try {
            user = userDao.getUserById(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return user;
    }
}
