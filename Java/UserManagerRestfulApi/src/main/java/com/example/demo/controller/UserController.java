package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.model.dto.UserDto;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @Autowired
    private UserRepository userRepository;

    @GetMapping("")
    public ResponseEntity<?> getListUsers(){
        List<UserDto> userDtos = userService.getListUsers();
        return ResponseEntity.ok(userDtos);
    }

    @GetMapping("/getuserbyid")
    public ResponseEntity<?> getUserById(@RequestParam("id") int id){
        System.out.println("getUserById");
        User user = userRepository.getUserById(id);
        return ResponseEntity.ok(user);
    }

    @GetMapping("/getuserbyname")
    public ResponseEntity<?> getUserByName(@RequestParam("name") String name){
        System.out.println("getUserByName");
        User user = userRepository.getUserByName(name);
        return ResponseEntity.ok(user);
    }

    @GetMapping("/search")
    public ResponseEntity<?> searchUser(@RequestParam(name = "keyword", required = false, defaultValue = "") String name){
        List<UserDto> userDtos = userService.searchUserDto(name);
        return ResponseEntity.ok(userDtos);
    }

    @PostMapping("")
    public ResponseEntity<?> createUser(){
        return null;
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateUser(){
        return null;
    }

    @DeleteMapping("{id}")
    public ResponseEntity<?> deleteUser(){
        return null;
    }
}

