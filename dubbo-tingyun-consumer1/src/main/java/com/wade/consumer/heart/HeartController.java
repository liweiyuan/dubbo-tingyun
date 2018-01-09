package com.wade.consumer.heart;

import com.wade.dubbo.demo.heart.HeartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by tingyun on 2017/12/15.
 */
@RestController
public class HeartController {

    @Autowired
    private HeartService heartService;

    @RequestMapping("/heart")
    public String getHeart(){
        System.err.println("this is heart consumer");
        return  heartService.heart("you heart");
    }
}
