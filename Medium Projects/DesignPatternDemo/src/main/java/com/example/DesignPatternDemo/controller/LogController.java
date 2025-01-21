package com.example.DesignPatternDemo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.DesignPatternDemo.config.LoggerService;

@RestController
public class LogController {

    @GetMapping("/log")
    public ResponseEntity<String> logMessage(){
        //Accessing the singleton instance
        LoggerService logger = LoggerService.getInstance();
        logger.log("This is a log Message!");
        return ResponseEntity.ok("Message logged succesfully");
    }
}
