package com.example.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.models.User_login;


public interface User_repository extends JpaRepository<User_login, Long> {

    User_login findByUsername(String username);
}
