package com.cisco.spring.bean;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class SpringBean {
    public SpringBean() {
        System.out.println("SpringBean - Constructor");
    }
}
