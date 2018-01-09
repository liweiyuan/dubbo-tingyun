package com.wade.consumer.api.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.wade.dubbo.demo.api.AnnotationService;
import org.springframework.stereotype.Component;

/**
 * Created by tingyun on 2017/12/15.
 */
@Component("annotationAction")
public class AnnotationAction {
    @Reference
    private AnnotationService annotationService;

    public String doSayHello(String name) {
        return annotationService.sayHello(name);
    }
}
