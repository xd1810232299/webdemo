package com.example.webdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("login")
public class LoginController {

    //登录页面
    @RequestMapping("/loginPage")
    public String login(){
        return "login";
    }

}
