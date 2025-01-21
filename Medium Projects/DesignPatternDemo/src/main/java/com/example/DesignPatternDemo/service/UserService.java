package com.example.DesignPatternDemo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.DesignPatternDemo.notification.Observer;

@Service
public class UserService {
    private List<Observer> observers = new ArrayList<>();

    // method to register observers
    public void registerObserver(Observer observer){
        observers.add(observer);
    }

    public void notifyObservers(String event){
        for(Observer observer: observers){
            observer.update(event);
        }
    }

    public void registerUser(String username){
        System.out.println("User registered: " + username);
        notifyObservers("user registration");
    }
}
