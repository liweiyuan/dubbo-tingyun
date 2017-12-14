package com.wade.consumer.controller;

import com.wade.dubbo.demo.CxfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by tingyun on 2017/12/13.
 */
@RestController
public class CxfController {

    @Autowired
    private CxfService webService;

    @RequestMapping("/webservice")
    public String getResult(){
        System.err.println("this is webservice consumer");
        return webService.getWebService("webservice");
    }
}
