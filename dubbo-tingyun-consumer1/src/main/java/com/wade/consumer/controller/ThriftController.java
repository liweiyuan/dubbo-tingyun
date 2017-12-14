package com.wade.consumer.controller;

import com.wade.dubbo.service.thrift.Demo;
import org.apache.thrift.TException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by tingyun on 2017/12/7.
 */
@RestController
public class ThriftController {

    @Autowired
    Demo.Iface demo;

    @RequestMapping("/thrift")
    public String getResult() throws TException {
        Integer i=demo.echoI32(32);
        return i.toString();
    }
}
