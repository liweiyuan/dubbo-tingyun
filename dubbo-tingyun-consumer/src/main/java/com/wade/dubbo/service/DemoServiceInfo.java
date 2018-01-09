package com.wade.dubbo.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.wade.dubbo.demo.DemoService;
import org.springframework.stereotype.Service;

/**
 * Created by tingyun on 2017/12/4.
 */
@Service
public class DemoServiceInfo {

    @Reference(version = "0.0.0",async = false)
    DemoService demoService;

    public String sayHello(){
        return demoService.sayHello("wade");
    }
}
