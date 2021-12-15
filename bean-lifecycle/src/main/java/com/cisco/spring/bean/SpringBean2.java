package com.cisco.spring.bean;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class SpringBean2 {


    @PostConstruct
    public void init(){
        System.out.println("SpringBean2 - Initialization");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("SpringBean2 - Just before destroy");
    }
}
