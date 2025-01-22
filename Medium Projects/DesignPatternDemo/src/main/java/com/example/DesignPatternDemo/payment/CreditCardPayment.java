package com.example.DesignPatternDemo.payment;

import org.springframework.stereotype.Component;

@Component("CreditCardPayment")
public class CreditCardPayment implements PaymentStrategy {

    @Override
    public void pay(double amount) {
        System.out.println("Paid $: " + amount + "with Credit Card");
    }

}
