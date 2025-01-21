package com.example.DesignPatternDemo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.DesignPatternDemo.payment.CreditCardPayment;
import com.example.DesignPatternDemo.payment.PayPalPayment;
import com.example.DesignPatternDemo.payment.PaymentStrategy;

@RestController
public class PaymentController {
    @GetMapping("/pay")
    public ResponseEntity<String> processPayment(@RequestParam String method, @RequestParam double amount){
        PaymentStrategy strategy = selectPaymentStrategy(method);
        if(strategy == null){
            return ResponseEntity.badRequest().body("Invalid Payment Method");
        }
        strategy.pay(amount);
        return ResponseEntity.ok("Payment processed succesfully");
    }

    private PaymentStrategy selectPaymentStrategy(String method){
        switch (method.toUpperCase()){
            case "CREDIT":return new CreditCardPayment();
            case "PAYPAL": return new PayPalPayment();
            default: return null;
        }
    }

}
