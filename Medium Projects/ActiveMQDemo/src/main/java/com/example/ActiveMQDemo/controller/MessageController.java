package com.example.ActiveMQDemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ActiveMQDemo.model.Item;
import com.example.ActiveMQDemo.service.MessageService;

@RestController
@RequestMapping("/api/message")
public class MessageController {
    @Autowired
    private MessageService messageService;

    @PostMapping("/send/{id}")
    public void send(@PathVariable("id") String id, @RequestBody List<Item> itemList){
        messageService.send(id, itemList);
    }
}
