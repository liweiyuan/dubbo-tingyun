package com.wade.consumer.controller;

import com.wade.dubbo.demo.MemcachedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by tingyun on 2017/12/8.
 */
//@RestController
public class MemcachedController {

    @Autowired
    private MemcachedService memcachedService;

    @GetMapping("/memcached")
    public String getResult(){
        System.err.println("this is memcached provider.");
        //memcachedService.setNumber("20");
        return memcachedService.getNumber();
    }

}
