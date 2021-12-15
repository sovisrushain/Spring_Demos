package com.cisco.spring;

import com.cisco.spring.bean.SpringBean;
import com.cisco.spring.bean.TestBean;
import lk.cisco.spring.SpringBeanTwo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan(basePackages = {"com", "lk"})
/* OR */
@ComponentScan(basePackageClasses = {SpringBean.class, SpringBeanTwo.class})
@Configuration
public class AppConfig {

    @Bean
    public TestBean myTestBean(){
        System.out.println("Invoked myTestBean()");
        return new TestBean();
    }
    /* BeanId = method name */
    /* @Bean(name="myBean", "myTest") - can specify several bean name aliases */
}
