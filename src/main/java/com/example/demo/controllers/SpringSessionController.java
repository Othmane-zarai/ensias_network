package com.example.demo.controllers;

import javax.servlet.http.HttpServletRequest;
import com.example.demo.repository.Post_repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import java.util.*;
import com.example.demo.models.*;
import com.example.demo.repository.User_repository;;

@Controller
@SessionAttributes("user_login")
public class SpringSessionController {
	
	@Autowired
	User_repository userRepository;
	
	@Autowired
	Post_repository postRepository;
	
    @GetMapping("/login")
    public String do_login() {
    	return "login";
    }
    @GetMapping({"/", "/index"})
    public String welcome(Model model, HttpServletRequest httpServletRequest) {
    	String username = httpServletRequest.getUserPrincipal().getName();
    	User_login user_found = userRepository.findByUsername(username);
    	List<Post> posts = postRepository.findAll();
        System.out.println(""+posts.get(0).getContenu()+""+posts.get(0).getNbre_like());
        
    	//model.addAttribute("posts", posts);
    	System.out.println(user_found.getMot_passe());
    	System.out.println(""+posts.get(0).getContenu());
        return "index";
    }

}