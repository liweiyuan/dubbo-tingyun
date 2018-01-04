package com.wade.dubbo.demo.callback;

/**
 * Created by tingyun on 2017/12/15.
 */
public interface CallbackListener {
    
    void changed(String msg) throws InterruptedException;
}
