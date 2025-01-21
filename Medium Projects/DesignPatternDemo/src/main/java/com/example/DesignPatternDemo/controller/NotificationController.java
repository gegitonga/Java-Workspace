package com.example.DesignPatternDemo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.DesignPatternDemo.notification.Notification;
import com.example.DesignPatternDemo.notification.NotificationFactory;

@RestController
public class NotificationController {
    @GetMapping("/notify")
    public ResponseEntity<String> notify(@RequestParam String type, @RequestParam String message){
        try {
            Notification notification = NotificationFactory.createNotification(type);
            notification.send(message);
            return ResponseEntity.ok("Notification sent successfully");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
}
