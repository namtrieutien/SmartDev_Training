package com.example.demo.controller;

import com.example.demo.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.net.http.HttpRequest;

@RestController
public class MyController {
    @RequestMapping(value = "/hello-world" , method = RequestMethod.GET)
    public ResponseEntity<?> helloWorld(){
        User user = new User(1, "namtt007");
        return ResponseEntity.status(HttpStatus.OK).body(user);
    }
}
