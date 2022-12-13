package com.bitterDount.frente.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.http.HttpServletRequest;

@FeignClient("resource")
public interface ResourceFeignService {
    @RequestMapping("/countResource")
    public int countResourceController();
}