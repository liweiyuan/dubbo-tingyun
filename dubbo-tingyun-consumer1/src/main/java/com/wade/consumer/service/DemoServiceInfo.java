package com.wade.consumer.service;

import com.alibaba.dubbo.rpc.RpcContext;
import com.wade.dubbo.demo.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by tingyun on 2017/12/5.
 */
@Service
public class DemoServiceInfo {


    //@Reference(version = "0.0.0",async = false)
    @Autowired
    DemoService demoService;

    public String sayHello(){
        //隐式传参数
        RpcContext.getContext().setAttachment("parameter",Thread.currentThread().getName());
        //String rsult=RpcContext.getContext().getUrl().getProtocol();
        //System.err.println("协议为："+rsult);
        return demoService.sayHello("wade");
    }

    public String getName(){
        RpcContext.getContext().setAttachment("parameter", String.valueOf(Thread.currentThread().getId()));
        return demoService.getName("hello,world");
    }
}
