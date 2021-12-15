package com.cisco.spring.bean;

import org.springframework.stereotype.Component;

@Component
public class Girl2 implements GoodGirl {

    @Override
    public void kiss() {
        System.out.println("Girl2 - I am a good girl");
    }
}
