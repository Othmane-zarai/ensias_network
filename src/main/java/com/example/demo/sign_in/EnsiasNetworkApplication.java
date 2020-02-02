package com.example.demo.sign_in;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration(exclude = {org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class})
@ComponentScan
public class EnsiasNetworkApplication {

	public static void main(String[] args) {
		SpringApplication.run(EnsiasNetworkApplication.class, args);
	}

}
