package com.example.DesignPatternDemo.payment;

public class PayPalPayment implements PaymentStrategy {

    @Override
    public void pay(double amount) {
        System.out.println("Paid $: " + amount + "with PayPal");
    }

}
