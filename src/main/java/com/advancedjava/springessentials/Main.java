package com.advancedjava.springessentials;

import com.advancedjava.springessentials.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Main {
    public static void main(String[] args) {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        context.getBeanFactory().createBean(SpringApplication.class).run();
        context.close();
    }
}
