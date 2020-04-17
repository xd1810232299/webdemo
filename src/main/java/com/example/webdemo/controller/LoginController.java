package com.example.webdemo.controller;

import com.example.webdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("login")
public class LoginController {


    @Autowired
    private UserService userService;

    //登录页面
    @RequestMapping("/loginPage")
    public void login(){
        System.out.println(userService.name);
        System.out.println("12346589");
    }

}
