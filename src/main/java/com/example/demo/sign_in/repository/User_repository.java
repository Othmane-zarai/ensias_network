package com.example.demo.sign_in.repository;
import com.example.demo.sign_in.models.User_login;
import org.springframework.data.jpa.repository.JpaRepository;

public interface User_repository extends JpaRepository<User_login, Long> {
    User_login findByUsername(String username);
}

