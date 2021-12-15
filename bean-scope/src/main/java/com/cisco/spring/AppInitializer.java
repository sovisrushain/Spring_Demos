package com.cisco.spring;

import com.cisco.spring.bean.MyBean;
import com.cisco.spring.bean.SpringBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();
        ctx.registerShutdownHook();

        SpringBean bean1 = ctx.getBean(SpringBean.class);
        SpringBean bean2 = ctx.getBean(SpringBean.class);

        System.out.println("bean 1 & bean 2 contains the context: " + ctx.containsBeanDefinition("springBean"));

        System.out.println(bean1 == bean2);

        MyBean bean3 = ctx.getBean(MyBean.class);
        MyBean bean4 = ctx.getBean(MyBean.class);

        System.out.println("bean 3 & bean 4 contains the context: " + ctx.containsBeanDefinition("myBean"));

        System.out.println(bean3 == bean4);
    }
}
