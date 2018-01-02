package com.wade.dubbo.provider;

import com.alibaba.dubbo.rpc.RpcContext;
import com.wade.dubbo.demo.DemoService;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by tingyun on 2017/12/4.
 */
//@Service(version = "0.0.0")
public class DemoServiceImpl implements DemoService {
    @Override
    public String sayHello(String name) throws InterruptedException {

        System.err.println("从消費端传递过来的参数:" + RpcContext.getContext().getAttachment("parameter"));
        System.err.println("[" + new SimpleDateFormat("HH:mm:ss").format(new Date()) + "] Hello " + name + ", request from consumer: " + RpcContext.getContext().getRemoteAddress());
        Thread.sleep(500);
        return "Hello " + name + ", response form provider: " + RpcContext.getContext().getLocalAddress();
    }

    @Override
    public String getName(String name) {
        System.err.println("from getName()"+"[" + "] Hello " + name + ", request from consumer: " + RpcContext.getContext().getRemoteAddress());
        return "This is for you , please try again. ";
    }
}
