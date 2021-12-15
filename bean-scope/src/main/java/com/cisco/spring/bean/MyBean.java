package com.cisco.spring.bean;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class MyBean {
    public MyBean() {
        System.out.println("MyBean - Constructor");
    }
}
