package com.fizz.tutorial.dal.model;

import com.alibaba.fastjson.JSON;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class TestDO implements Serializable {

    private Long id;
    private String a;
    private String b;
    private String c;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
