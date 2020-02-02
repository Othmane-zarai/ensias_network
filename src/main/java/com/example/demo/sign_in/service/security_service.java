package com.example.demo.sign_in.service;

public interface security_service {
    String findLoggedInUsername();

    void autoLogin(String username, String password);
}
