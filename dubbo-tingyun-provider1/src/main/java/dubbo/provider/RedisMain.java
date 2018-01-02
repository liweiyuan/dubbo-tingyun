package com.wade.dubbo.provider;

import com.alibaba.dubbo.common.URL;
import com.alibaba.dubbo.common.extension.ExtensionLoader;
import com.alibaba.dubbo.registry.Registry;
import com.alibaba.dubbo.registry.RegistryFactory;

import java.io.IOException;

/**
 * Created by tingyun on 2017/12/8.
 * 实现基于Redis的Dubbo服务接口
 */
public class RedisMain {

    public static void main(String[] args) throws IOException {
        RegistryFactory factory =
                ExtensionLoader.getExtensionLoader(RegistryFactory.class).getAdaptiveExtension();
        Registry registry = factory.getRegistry(URL.valueOf("zookeeper://127.0.0.1:2181"));
        //注册服务
        registry.register(URL.valueOf("redis://10.128.0.40/com.wade.dubbo.demo.RedisService?category=provid" +
                "ers&dynamic=false&application=provider-redis&group=member&loadbalance=consistenthash));"));

        //
        System.in.read();
    }
}
