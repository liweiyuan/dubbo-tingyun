package com.wade.dubbo.demo.domain;

import java.io.Serializable;

/**
 * Created by tingyun on 2017/12/15.
 */
public class User  implements Serializable{

    private Integer id;
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
