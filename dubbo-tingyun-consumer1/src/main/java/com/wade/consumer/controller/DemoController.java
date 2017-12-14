package com.wade.consumer.controller;

import com.alibaba.dubbo.rpc.RpcContext;
import com.wade.consumer.service.DemoServiceInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/**
 * Created by tingyun on 2017/12/5.
 */
@RestController
public class DemoController {

    private static Logger LOGGER= LoggerFactory.getLogger(DemoController.class);

    @Autowired
    private DemoServiceInfo demoServiceInfo;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        return "index";
    }

    @GetMapping("/index")
    public String home(){
        return "index";
    }

    @RequestMapping("/consumer")
    @ResponseBody
    //@GetMapping("/consumer")
    public String getResult() throws ExecutionException, InterruptedException {

        demoServiceInfo.sayHello();
        Future future = RpcContext.getContext().getFuture();
        String result = (String) future.get();
        return result;
    }

    @RequestMapping("/consumer1")
    public String getName() throws ExecutionException, InterruptedException {
        demoServiceInfo.getName();
        Future<String> future=RpcContext.getContext().getFuture();
        String result =future.get();
        return result;
    }

}
