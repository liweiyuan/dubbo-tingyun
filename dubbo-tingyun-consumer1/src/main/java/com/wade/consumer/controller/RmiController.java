package com.wade.consumer.controller;

import com.alibaba.dubbo.rpc.RpcContext;
import com.wade.dubbo.demo.RmiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by tingyun on 2017/12/13.
 */
@RestController
public class RmiController {

    @Autowired
    private RmiService rmiService;


    @RequestMapping("/rmi")
    public String getRmi() {
        System.err.println("This is rmi consumer");
        RpcContext.getContext().setAttachment("java","hello");
        return rmiService.getRmi(RpcContext.getContext().getAttachment("rmi"));
    }
}
