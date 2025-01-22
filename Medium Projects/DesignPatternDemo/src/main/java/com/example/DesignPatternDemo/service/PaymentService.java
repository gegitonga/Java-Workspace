package com.example.DesignPatternDemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.DesignPatternDemo.payment.PaymentStrategy;

@Service
public class PaymentService {
    private final PaymentStrategy paymentStrategy;

    @Autowired
    public PaymentService(@Qualifier("payPalPayment") PaymentStrategy paymentStrategy){
        this.paymentStrategy = paymentStrategy;
    }

    public void processPayment(double amount){
        paymentStrategy.pay(amount);
    }

}
