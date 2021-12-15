package com.cisco.spring.bean;

import org.springframework.stereotype.Component;

@Component(value = "abc")
public class MyBean {
    public MyBean() {
        System.out.println("MyBean - Constructor");
    }
}
