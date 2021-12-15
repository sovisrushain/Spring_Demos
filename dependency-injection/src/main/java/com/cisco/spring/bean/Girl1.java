package com.cisco.spring.bean;

import org.springframework.stereotype.Component;

@Component
public class Girl1 implements GoodGirl {

    @Override
    public void kiss() {
        System.out.println("Girl1 - I am a good girl");
    }
}
