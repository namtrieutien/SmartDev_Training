package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class GirlFriend {
    @Autowired
    public Dress dress;

    public GirlFriend() {
    }

    public GirlFriend(Dress dress) {
        this.dress = dress;
    }

    public Dress getDress() {
        return dress;
    }


    public void setDress(Dress dress) {
        this.dress = dress;
    }
}
