package com.silly.shop.controller;

import com.silly.shop.model.user.User;
import com.silly.shop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by yunlong.zhang on 2017/11/5.
 * user/show?name=34234
 */
@RestController
@RequestMapping(value="/user")
public class HelloController {
    @Autowired
    UserService userService;

    @GetMapping("hello")
    public String hello(){
        return "Hello World";
    }
    @RequestMapping(value = "/show")
    @ResponseBody
    public String show(@RequestParam(value = "name")String id){
        User user = userService.findUserById(id);
        if(null != user)
            return user.getUserId()+"/"+user.getEmail()+"/"+user.getPhoneNum();
        else return "null";
    }
}
