package com.wade.dubbo.demo;

/**
 * Created by tingyun on 2017/12/4.
 */
public interface DemoService {

    public String sayHello(String name) throws InterruptedException;

    public String getName(String name);
}
