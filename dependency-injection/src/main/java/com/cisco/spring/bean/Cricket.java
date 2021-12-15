package com.cisco.spring.bean;

import org.springframework.stereotype.Component;

@Component
public class Cricket implements Sport{
    @Override
    public void play() {
        System.out.println("I play Cricket");
    }
}
