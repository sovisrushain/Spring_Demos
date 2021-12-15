package com.cisco.spring;

import com.cisco.spring.bean.Boy;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();
        ctx.registerShutdownHook();

        Boy boy = ctx.getBean(Boy.class);


        boy.gf.kiss();
        boy.myPet.type();
        System.out.println(boy.bestFriend.name);
        boy.knowMySport(boy.favSport);
    }
}
