package com.silly.shop.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yunlong.zhang on 2017/11/5.
 */
@RestController
public class HelloController {
    @GetMapping("hello")
    public String hello(){
        return "Hello World";
    }
}
