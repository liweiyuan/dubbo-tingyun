package com.wade.consumer.controller;

import com.alibaba.dubbo.rpc.RpcContext;
import com.wade.dubbo.demo.DubboService;
import com.wade.dubbo.demo.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/**
 * Created by tingyun on 2017/12/15.
 */
@RestController
public class DubboController {

    @Autowired
    private DubboService dubboService;

    @RequestMapping("/dubbo")
    public String getResult() throws ExecutionException, InterruptedException {
        //创建一个User对象
        User user=new User();
        user.setId(20);
        user.setName("wade");
        dubboService.helloDubbo(user);
        Future<String> future= RpcContext.getContext().getFuture();
        String result=future.get();
        System.err.println("this is method helloDubbo consumer");
        return result;
    }
}
