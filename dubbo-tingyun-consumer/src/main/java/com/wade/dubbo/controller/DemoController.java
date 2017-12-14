package com.wade.dubbo.controller;

import com.wade.dubbo.demo.DemoService;
import com.wade.dubbo.service.DemoServiceInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by tingyun on 2017/12/4.
 */
@RestController
public class DemoController {

    @Autowired
    private DemoServiceInfo demoServiceInfo;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        return "index";
    }

    @GetMapping("/consumer")
    public String result(){
        return demoServiceInfo.sayHello();
    }
}
