package com.wade.dubbo.provider.memcached;

import com.wade.dubbo.demo.MemcachedService;

/**
 * Created by tingyun on 2017/12/14.
 */
public class MemcachedServiceImpl implements MemcachedService {

    private String number;

    @Override
    public String getNumber() {
        System.err.println("this is MemcachedServiceImpl provider.");
        return number;
    }

    @Override
    public void setNumber(String number) {
        this.number = number;
    }
}
