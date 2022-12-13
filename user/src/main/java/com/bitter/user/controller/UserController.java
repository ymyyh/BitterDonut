package com.bitter.user.controller;

import com.bitter.user.Service.UserService;
import com.bitter.user.Service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class UserController {
    @Autowired
    public UserService userService;
    @RequestMapping("/login")
    public void login(int id, String name, String url){
        userService.insertResource(id, name, url);
        return;
    }
}
