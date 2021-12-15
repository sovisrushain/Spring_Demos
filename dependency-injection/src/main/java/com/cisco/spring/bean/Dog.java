package com.cisco.spring.bean;

import org.springframework.stereotype.Component;

@Component(value = "cuteDog")
public class Dog implements Pet {

    @Override
    public void type() {
        System.out.println("I am a Dog");
    }
}
