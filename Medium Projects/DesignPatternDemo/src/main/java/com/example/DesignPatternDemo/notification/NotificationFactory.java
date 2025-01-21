package com.example.DesignPatternDemo.notification;

public class NotificationFactory {
    public static Notification createNotification(String type){
        switch (type.toUpperCase()){
            case "EMAIL":
                return new EmailNotification();
            case "SMS":
                return new SMSNotification();
            default:
                throw new IllegalArgumentException("Unknown notification type: " + type);
        }
    }

}
