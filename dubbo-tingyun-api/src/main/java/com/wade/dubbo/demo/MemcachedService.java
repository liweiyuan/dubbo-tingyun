package com.wade.dubbo.demo;

/**
 * Created by tingyun on 2017/12/14.
 */
public interface MemcachedService {

    public void setNumber(String number);

    public String getNumber();
}
