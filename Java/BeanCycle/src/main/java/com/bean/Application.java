package com.bean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        BeanCycle beanCycle = (BeanCycle) applicationContext.getBean(BeanCycle.class);
        applicationContext.close();
    }
}
