package com.wade.dubbo.consumer;

import com.wade.dubbo.demo.DemoService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by tingyun on 2017/12/4.
 */
public class ConsumerMain {

    public static void main(String[] args) {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("dubbo-tingyun-consumer.xml");
        DemoService demoService= (DemoService) ctx.getBean("demoService");

        String result=demoService.sayHello("wade");
        System.err.println(result);
    }
}
