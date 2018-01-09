package com.wade.dubbo.provider.callback;

import com.wade.dubbo.demo.callback.CallbackListener;
import com.wade.dubbo.demo.callback.CallbackService;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by tingyun on 2017/12/15.
 */
public class CallbackServiceImpl implements CallbackService {

    private final Map<String, CallbackListener> listeners = new ConcurrentHashMap<String, CallbackListener>();

    @Override
    public void addListener(String key, CallbackListener listener) {
        listeners.put(key, listener);
        listener.changed(getChanged(key)); // 发送变更通知
    }

    private String getChanged(String key) {
        System.err.println("this is for you.");
        return "Changed: " + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
    }
}
