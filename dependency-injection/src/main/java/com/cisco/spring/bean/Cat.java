package com.cisco.spring.bean;

import org.springframework.stereotype.Component;

@Component(value = "cuteCat")
public class Cat implements Pet {

    @Override
    public void type() {
        System.out.println("I am a Cat");
    }
}
