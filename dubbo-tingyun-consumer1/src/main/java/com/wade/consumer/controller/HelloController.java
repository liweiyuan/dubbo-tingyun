package com.wade.consumer.controller;

import com.wade.dubbo.demo.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by tingyun on 2017/12/13.
 */
@RestController
public class HelloController {

    @Autowired
    private HelloService helloService;

    @RequestMapping("/hello")
    public String getResult(){
        System.err.println("this is helloService consumer");
        return helloService.getResult("32");
    }
}
