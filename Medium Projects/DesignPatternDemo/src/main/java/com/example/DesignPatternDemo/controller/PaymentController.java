package com.example.DesignPatternDemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.DesignPatternDemo.service.PaymentService;

@RestController
public class PaymentController {
    private final PaymentService paymentService;

    @Autowired
    public PaymentController(PaymentService paymentService){
        this.paymentService = paymentService;
    }

    @GetMapping("/pay")
    public String makePayment(@RequestParam double amount) {
        paymentService.processPayment(amount);
        return "Payment processed using the current strategy!";
    }

    // @GetMapping("/pay")
    // public ResponseEntity<String> processPayment(@RequestParam String method, @RequestParam double amount){
    //     PaymentStrategy strategy = selectPaymentStrategy(method);
    //     if(strategy == null){
    //         return ResponseEntity.badRequest().body("Invalid Payment Method");
    //     }
    //     strategy.pay(amount);
    //     return ResponseEntity.ok("Payment processed succesfully");
    // }

    // private PaymentStrategy selectPaymentStrategy(String method){
    //     switch (method.toUpperCase()){
    //         case "CREDIT":return new CreditCardPayment();
    //         case "PAYPAL": return new PayPalPayment();
    //         default: return null;
    //     }
    // }

}
