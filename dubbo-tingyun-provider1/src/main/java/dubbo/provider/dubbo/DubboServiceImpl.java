package com.wade.dubbo.provider.dubbo;

import com.alibaba.dubbo.rpc.RpcContext;
import com.wade.dubbo.demo.DubboService;
import com.wade.dubbo.demo.domain.User;

/**
 * Created by tingyun on 2017/12/15.
 */
public class DubboServiceImpl implements DubboService {
    @Override
    public String helloDubbo(User user) {
        System.err.println("this is dubbo provider,execute the method");
        return "the User: " + RpcContext.getContext().getRemoteAddress() + " : " + user;
    }
}
