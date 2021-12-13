package com.cisco.spring.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan
@Configuration
public class AppConfig {
    public AppConfig() {
        System.out.println("AppConfig Constructor");
    }
}
