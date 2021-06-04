package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {
    @GetMapping("")
    public ResponseEntity<?> getListUsers(){
        return null;
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

