package com.example.demo.service;

import com.example.demo.repository.GameRepository;
import com.example.demo.repository.GroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GroupServiceImp implements GroupService{
    @Autowired
    private GroupRepository groupRepository;


}
