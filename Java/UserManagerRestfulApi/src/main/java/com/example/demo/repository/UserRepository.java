package com.example.demo.repository;

import com.example.demo.entity.User;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository <User, Long>{
    User getUserById(int id);
    @Query("SELECT u FROM User u WHERE u.name = :name")
    User getUserByName(@Param("name") String name);

    @Modifying
    @Query("DELETE FROM User u WHERE u.id = :id")
    void deleteUserById(@Param("id") int id);

    @Modifying
    @Query("DELETE FROM User u WHERE u.name = :name")
    void deleteUserByName(@Param("name") String name);

}
