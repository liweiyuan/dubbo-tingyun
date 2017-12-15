package com.wade.consumer.controller;

import com.wade.dubbo.demo.callback.CallbackListener;
import com.wade.dubbo.demo.callback.CallbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by tingyun on 2017/12/15.
 */
@RestController
public class CallbackController {

    @Autowired
    private CallbackService callbackService;

    @RequestMapping("/callback")
    public void getResult() {
        callbackService.addListener("foo.bar", new CallbackListener() {
            @Override
            public void changed(String msg) {
                System.err.println("callback1:" + msg);
            }
        });
    }
}
