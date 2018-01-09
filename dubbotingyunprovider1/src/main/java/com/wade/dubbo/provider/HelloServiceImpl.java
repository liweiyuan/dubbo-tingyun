package com.wade.dubbo.provider;

import com.alibaba.dubbo.rpc.RpcContext;
import com.wade.dubbo.demo.HelloService;

/**
 * Created by tingyun on 2017/12/13.
 */
public class HelloServiceImpl implements HelloService{
    @Override
    public String getResult(String id) {

        System.err.println("this is "+ id);
        return "Hello " + id + ", response form  HelloServiceImpl provider: " + RpcContext.getContext().getLocalAddress();
    }
}
