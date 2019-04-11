package com.baizhi.controller;

import org.springframework.stereotype.Controller;

@Controller
public class userController {
    public String test(){
        System.out.println("1234567");
        return "aa";
    }
}
