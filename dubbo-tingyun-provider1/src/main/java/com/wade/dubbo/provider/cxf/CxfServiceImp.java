package com.wade.dubbo.provider.cxf;

import com.alibaba.dubbo.rpc.RpcContext;
import com.wade.dubbo.demo.CxfService;

/**
 * Created by tingyun on 2017/12/13.
 */
public class CxfServiceImp implements CxfService {
    @Override
    public String getWebService(String name) {
        System.err.println("this is webService provider");
        return "result: "+RpcContext.getContext().getLocalAddress();
    }
}
