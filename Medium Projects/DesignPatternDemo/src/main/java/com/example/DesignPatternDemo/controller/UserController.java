package com.example.DesignPatternDemo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.DesignPatternDemo.notification.EmailObserver;
import com.example.DesignPatternDemo.notification.SMSObserver;
import com.example.DesignPatternDemo.service.UserService;

@RestController
@RequestMapping("/api")
public class UserController {
    private final UserService userService;

    public UserController(){
        this.userService = new UserService();

        userService.registerObserver(new EmailObserver());
        userService.registerObserver(new SMSObserver());
    }
    @PostMapping("/register")
    public ResponseEntity<String> registerUser(@RequestParam String username){
        userService.registerUser(username);
        return ResponseEntity.ok("User registered and notifications sent");
    }


}
