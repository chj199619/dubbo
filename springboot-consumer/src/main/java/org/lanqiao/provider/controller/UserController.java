package org.lanqiao.provider.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import org.lanqiao.provider.service.DubboProvider;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Reference
    DubboProvider provider;
    @RequestMapping("ticket")
    public String getTicket(){
        return provider.buyTicket();
    }
}
