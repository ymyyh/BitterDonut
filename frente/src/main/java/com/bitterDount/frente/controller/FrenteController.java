package com.bitterDount.frente.controller;

import com.bitter.common.pojo.Resource;
import com.bitterDount.frente.feign.ResourceFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/")
public class FrenteController {
    @Autowired
    ResourceFeignService resourceFeignService;

    @RequestMapping("/homepage")
    public String getHomePage(@RequestParam(required = false,defaultValue = "0") int page,
                              HttpServletRequest request){
        int countResource = resourceFeignService.countResourceController();
        request.setAttribute("countResources", countResource);
        return "/WEB-INF/index.jsp";
    }
    @RequestMapping("/login")
    public String getLogin(){
        return "login.html";
    }
}
