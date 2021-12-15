package com.cisco.spring.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SpringBean {

    /* Basic */
    @Value("Spring")
    private String frameWork;

    @Value("Java,TypeScript,Go")
    private List<String> languages;

    /* Property */
    @Value("${os.project}")
    private String os;

    public SpringBean(@Value("I am a bean") String name) {
        System.out.println(name);
    }

    public void setFrameWork() {
        System.out.println(frameWork);
    }

    public void setLanguages() {
        languages.forEach(System.out::println);
    }

    public void showEnvInfo() {
        System.out.println(os);
    }
}
