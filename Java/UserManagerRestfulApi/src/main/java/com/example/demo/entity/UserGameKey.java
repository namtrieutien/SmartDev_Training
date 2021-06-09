package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class UserGameKey implements Serializable {

    @Column(name="user_id")
    int user_id;

    @Column(name="game_id")
    int game_id;

}
