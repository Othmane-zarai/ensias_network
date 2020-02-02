package com.example.demo.sign_in.service;
import com.example.demo.sign_in.models.User_login;

public interface user_service {
    void save(User_login user);

    User_login findByUsername(String username);
}