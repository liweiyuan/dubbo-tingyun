package com.wade.dubbo.provider.controller;

import com.wade.dubbo.provider.ProviderMain;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

/**
 * Created by tingyun on 2018/1/5.
 */
@RestController
public class ProviderController {

    @RequestMapping("/provider")
    @ResponseBody
    public String getStart() throws IOException {
        ProviderMain providerMain=new ProviderMain();
        providerMain.start();
        return "the server is running.";
    }
}
