package com.cisco.spring;

import com.cisco.spring.bean.SpringBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();
        ctx.registerShutdownHook();

        SpringBean bean1 = ctx.getBean(SpringBean.class);
        bean1.setFrameWork();
        bean1.setLanguages();
        bean1.showEnvInfo();
    }
}
