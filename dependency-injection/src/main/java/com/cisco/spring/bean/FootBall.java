package com.cisco.spring.bean;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class FootBall implements Sport{
    @Override
    public void play() {
        System.out.println("I play FootBall");
    }
}
