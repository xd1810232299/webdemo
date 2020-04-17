package com.example.webdemo.service;


import com.example.webdemo.entity.User;
import com.example.webdemo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserService {

    public String name = "789";

//    @Autowired
//    private UserRepository userRepository;

//    @Transactional
//    public List<User> findAll(){
//
//        List<User> all = userRepository.findAll();
//
//        return all == null?null:all;
//    }

}
