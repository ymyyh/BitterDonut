package com.bitterDount.frente.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class FrenteController {
    @RequestMapping("/")
    public String getHomePage(){
        return "index.html";
    }
}
