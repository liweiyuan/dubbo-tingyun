package com.wade.consumer.controller;


import com.wade.consumer.util.UrlUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.Map;

/**
 * Created by tingyun on 2017/12/13.
 */
@RestController
public class UrlController {


    @RequestMapping("/url")
    public String getHello() throws IOException {
        String urlString="http://localhost:8080/reportConfig/hello/url";
        HttpURLConnection connection= UrlUtil.createConnection(urlString);
        connection.setRequestMethod("GET");
        connection.connect();
        Map map = UrlUtil.getResponsecodeAndTime(connection);
        int statusCode = (Integer) map.get("statusCode");
        return String.valueOf(statusCode);
    }
}
