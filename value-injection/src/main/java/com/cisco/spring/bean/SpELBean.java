package com.cisco.spring.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.Map;

@Component
public class SpELBean {

    @Value("#{25}")
    private int age;

    @Value("#{true }")
    private boolean flag;

    @Value("#{'Hello'}")
    private String greet;

    @Value("#{{'Bob', 'Alice', 'Jack'}}")
    private List<String> names;

    @Value("#{{id:'C001',name:'Bob', address: 'Colombo'}}")
    private Map<String, String> properties;

    @PostConstruct
    public void init(){
        System.out.println(age);
        System.out.println(flag);
        System.out.println(greet);
        System.out.println(names);
        System.out.println(properties);
    }
}
