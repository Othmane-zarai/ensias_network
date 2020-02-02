package com.example.demo.sign_in.service;
import  com.example.demo.sign_in.models.User_login;
import com.example.demo.sign_in.repository.User_repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
@Service
public class user_details_service_impl implements UserDetailsService {
    @Autowired
    private User_repository userRepository;

    @Override
    @Transactional(readOnly = true)
    public UserDetails loadUserByUsername(String username) {
        User_login user = userRepository.findByUsername(username);
        if (user == null) throw new UsernameNotFoundException(username);
        return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getMot_passe(),null);
    }

}
