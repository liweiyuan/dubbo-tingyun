package com.wade.dubbo.provider.api;

import com.alibaba.dubbo.config.annotation.Service;
import com.wade.dubbo.demo.api.AnnotationService;

/**
 * Created by tingyun on 2017/12/15.
 */
@Service
public class AnnotationServiceImpl implements AnnotationService {
    @Override
    public String sayHello(String name) {
        System.err.println("async provider received: " + name);
        return "annotation: hello, " + name;
    }
}
