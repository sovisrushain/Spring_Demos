package com.cisco.spring;

import com.cisco.spring.api.CustomerController;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@ComponentScan(basePackageClasses = CustomerController.class)
@Configuration
public class WebAppConfig {
}
