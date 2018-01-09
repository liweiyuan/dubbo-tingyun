package com.wade.dubbo.provider.heart;

import com.wade.dubbo.demo.heart.HeartService;

/**
 * Created by tingyun on 2017/12/15.
 */
public class HeartServiceImpl  implements HeartService{

    @Override
    public String heart(String name) {
        System.err.println("this is my heart.");
        return new StringBuilder(32).append("Hello, ").append(name).append("!").toString();
    }
}
