package com.example.ActiveMQDemo.service;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ActiveMQDemo.model.Item;
import com.example.ActiveMQDemo.queue.Producer;
import com.google.gson.Gson;

@Service
public class MessageService {
    @Autowired
    private Producer producer;

    public void send(String id, List<Item> itemList){
        Map<String, Object> map  = new HashMap<>();

        map.put(id, id);
        map.put("itemList", itemList);

        String json = new Gson().toJson(map);
        producer.sendMessage(json);
    }
}
