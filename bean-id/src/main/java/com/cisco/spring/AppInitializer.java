package com.cisco.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();

        System.out.println(ctx.containsBeanDefinition("springBean"));
        System.out.println(ctx.containsBeanDefinition("myBean"));
        System.out.println(ctx.containsBeanDefinition("abc"));
        System.out.println(ctx.containsBeanDefinition("springBeanTwo"));
        System.out.println(ctx.containsBeanDefinition("myTestBean"));
    }
}
