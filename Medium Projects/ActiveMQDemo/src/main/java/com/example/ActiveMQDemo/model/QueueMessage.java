package com.example.ActiveMQDemo.model;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class QueueMessage {
    private String name;
    private List<Item> itemList;
}
