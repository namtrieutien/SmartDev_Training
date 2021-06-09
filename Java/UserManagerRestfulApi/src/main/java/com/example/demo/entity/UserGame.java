package com.example.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "users_games")
public class UserGame {
    @EmbeddedId
    UserGameKey id;

    @ManyToOne
    @MapsId("user_id")
    @JoinColumn(name = "user_id")
    User user;

    @ManyToOne
    @MapsId("game_id")
    @JoinColumn(name = "game_id")
    Game game;

}
