package com.example.demo.service;

import com.example.demo.entity.User;
import com.example.demo.exception.NotFoundException;
import com.example.demo.model.dto.UserDto;
import com.example.demo.model.mapper.UserMapper;
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
    public List<UserDto> getListUsers() {
        ArrayList<UserDto> userDtos = new ArrayList<>();
        for(User user : users){
            userDtos.add(UserMapper.toUserDto(user));
        }
        return userDtos;
    }

    @Override
    public UserDto getUserById(int id) {
        for(User user: users){
            if(user.getId() == id){
               return UserMapper.toUserDto(user);
            }
        }

        throw new NotFoundException("User không tồn tại");
    }

    @Override
    public List<UserDto> searchUserDto(String name) {
        List<UserDto> userDtos = new ArrayList<>();
        for(User user: users){
            if(user.getName().contains(name)){
                userDtos.add(UserMapper.toUserDto(user));
            }
        }
        return userDtos;
    }
}
