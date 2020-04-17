package com.example.webdemo.controller;

import com.example.webdemo.entity.User;
import com.example.webdemo.entity.UserDao;
import com.example.webdemo.repository.TestRepository;
import com.example.webdemo.repository.UserRepository;
import com.example.webdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

//    @RequestMapping("/allUser")
//    public String findAll(){
//
//        String result = null;
//
//        List<User> all = userService.findAll();
//
//        for (User user : all) {
//            System.out.println(user.toString());
//            result += user.toString();
//        }
//
//        System.out.println(result);
//
//        return result;
//    }


    @RequestMapping("/allUser")
    public void findAll(){

        userService.name = "123456789";

        System.out.println(userService.name);

    }

}
