package com.wade.consumer.controller;

import com.wade.dubbo.demo.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by tingyun on 2017/12/14.
 */
//@RestController
public class RedisController {

    @Autowired
    private RedisService redisService;

    @RequestMapping("/redis")
    public String getResult(){
        System.err.println("this is redis provider.");
        //redisService.setNumber("60");
        return redisService.getNumber();
    }
}
