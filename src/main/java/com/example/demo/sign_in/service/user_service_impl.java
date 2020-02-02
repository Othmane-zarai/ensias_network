package com.example.demo.sign_in.service;


import com.example.demo.sign_in.models.User_login;
import com.example.demo.sign_in.repository.User_repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.stereotype.Service;



@Service
public class user_service_impl implements user_service {
    @Autowired
    private User_repository userRepository;

    @Autowired
    private NoOpPasswordEncoder noOpPass;

    @Override
    public void save(User_login user) {
        user.setMot_passe(noOpPass.encode(user.getMot_passe()));
        userRepository.save(user);
    }

    @Override
    public User_login findByUsername(String username) {
        return userRepository.findByUsername(username);
    }
}