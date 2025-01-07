package com.tacoshop.demo.controller;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tacoshop.demo.config.RegistrationForm;
import com.tacoshop.demo.repository.UserRepository;

@Controller
@RequestMapping("/register")
public class RegistrationController {
	
	private UserRepository userRepository;
	private PasswordEncoder passwordEncoder;
	
	public RegistrationController(UserRepository userRepository, PasswordEncoder passwordEncoder) {
		this.userRepository = userRepository;
		this.passwordEncoder = passwordEncoder;
	}
	
	@GetMapping
	public String registerForm() {
		return "registration";
	}
	
	@PostMapping
	public String processRegistation(RegistrationForm form) {
		userRepository.save(form.toUser(passwordEncoder));
		
		return "redirect:/login";
	}

}
