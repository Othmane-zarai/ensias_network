package com.example.demo.sign_in.service;
import org.springframework.stereotype.Repository;

import com.example.demo.models.User_login;
@Repository
public interface user_service {
    void save(User_login user);

    User_login findByUsername(String username);
}