package com.wade.dubbo.provider.hessian;

import com.alibaba.dubbo.rpc.RpcContext;
import com.wade.dubbo.demo.HessianService;

/**
 * Created by tingyun on 2017/12/13.
 */
public class HessianServiceImpl implements HessianService {
    @Override
    public String getHessian(String name) {
        System.err.println("This is hessian provider");

        return "hessian : " + RpcContext.getContext().getRemoteAddress();
    }
}
