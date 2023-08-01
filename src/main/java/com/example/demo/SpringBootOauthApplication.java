package com.example.demo;

import java.security.Principal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootOauthApplication {
	
	@GetMapping("/")
	public String getUser(Principal principal) {
		return "Hi" + principal.getName() + "Welcome to Spring Boot";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootOauthApplication.class, args);
	}

}
