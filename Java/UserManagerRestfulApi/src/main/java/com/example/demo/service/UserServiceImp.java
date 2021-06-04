package com.example.demo.service;

import com.example.demo.entity.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserServiceImp implements UserService{
    private static ArrayList<User> users = new ArrayList<>();
    static {
        users.add(new User(1,"namtt007","nam@gmail.com", "0938001142", "avatar_namtt007", "password_namtt007"));
        users.add(new User(2,"weedsquiet","weedsquiet@gmail.com", "0935078541", "avatar_weedsquiet", "password_weedsquiet"));
    }

    @Override
    public List<User> getListUsers() {
        return users;
    }
}
