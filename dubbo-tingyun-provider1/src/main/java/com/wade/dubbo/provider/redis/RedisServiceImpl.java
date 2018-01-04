package com.wade.dubbo.provider.redis;

import com.wade.dubbo.demo.RedisService;

/**
 * Created by tingyun on 2017/12/14.
 */
public class RedisServiceImpl implements RedisService {

    private String number;

    @Override
    public String getNumber() {
        System.err.println("this is RedisServiceImpl getNumber");
        return number;
    }

    @Override
    public void setNumber(String number) {
        this.number = number;
    }
}
