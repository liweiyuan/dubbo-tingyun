package com.wade.consumer.api;

import com.wade.consumer.api.service.AnnotationAction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by tingyun on 2017/12/15.
 */
@RestController
public class ApiController {

    @Autowired
    private AnnotationAction annotationAction;

    @RequestMapping("/api")
    public String getApi(){
        System.err.println("this is api consumer");
        String result =annotationAction.doSayHello("hello");
        return  result;
    }
}
