package com.example.demo.sign_in.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class user_controller {

    @GetMapping("/login")
    public String login(Model model) {
    	//model.addAttribute("error", new User_login(3, "Hassan", "l9owad", "l9owad"));
    	return "login";
    }
    @GetMapping({"/", "/index"})
    public String welcome(Model model) {
        return "index";
    }
}
