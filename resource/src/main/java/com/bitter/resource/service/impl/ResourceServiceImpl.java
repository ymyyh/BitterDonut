package com.bitter.resource.service.impl;

import com.bitter.resource.mapper.ResourceMapper;
import com.bitter.resource.service.ResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ResourceServiceImpl implements ResourceService {
    @Autowired
    ResourceMapper resourceMapper;
    public int countResourceService(){
        return (int) resourceMapper.countResource();
    }
}
