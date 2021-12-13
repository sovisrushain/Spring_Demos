package com.cisco.spring.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class SpringBean implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {
    public SpringBean() {
        System.out.println("(01) - Constructor - initialization");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("(03) - BeanNameAware - Bean Name "+ s);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("(04) - BeanFactoryAware - Associate with factory "+ beanFactory);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("(05) - ApplicationContextAware - Associate with context "+ applicationContext);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("(06) - InitializingBean - Ready to use state ");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("(07) - DisposableBean - Just Before destroy ");
    }

}
