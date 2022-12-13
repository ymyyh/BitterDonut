package com.bitter.resource.controller;

import com.bitter.resource.service.ResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class ResourceController {
    @Autowired
    ResourceService resourceService;

    @RequestMapping("/countResource")
    @ResponseBody
    public int countResourceController(){
        return resourceService.countResourceService();
    }
}
