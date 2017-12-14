package com.wade.consumer.controller;

import com.wade.dubbo.demo.HessianService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by tingyun on 2017/12/13.
 */
@RestController
public class HessianController {

    @Autowired
    private HessianService hessianService;

    @RequestMapping("/hessian")
    public String getHessian(){
        System.err.println("This is Hessian consumer.");
        return  hessianService.getHessian("lua");
    }
}
