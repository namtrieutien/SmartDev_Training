package com.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class BeanCycle implements InitializingBean, DisposableBean {
    @Override
    public void afterPropertiesSet(){
        System.out.println("InitializingBean");
    }

    @Override
    public void destroy(){
        System.out.println("DisposableBean");
    }
}
