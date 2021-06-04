package com.example.demo.service;

import com.example.demo.entity.User;
import com.example.demo.model.dto.UserDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    List<UserDto> getListUsers();
    UserDto getUserById(int id);
    List<UserDto> searchUserDto(String name);
}
