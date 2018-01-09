package com.wade.dubbo.provider.rmi;

import com.alibaba.dubbo.rpc.RpcContext;
import com.wade.dubbo.demo.RmiService;

/**
 * Created by tingyun on 2017/12/13.
 */
public class RmiServiceImpl implements RmiService {
    @Override
    public String getRmi(String result) {


        String result1 = RpcContext.getContext().getAttachment("java");
        System.err.print("result : " + result1);
        System.err.println("This is rmi provider");
        return "rmi : " + RpcContext.getContext().setAttachment("rmi", "^_^");
    }
}
