package com.wade.dubbo.provider;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by tingyun on 2017/12/4.
 */
public class ProviderMain {


    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext ctx=
                new ClassPathXmlApplicationContext("dubbo-tingyun-provider.xml");
        ctx.start();
        System.in.read(); // 按任意键退出
    }
}
