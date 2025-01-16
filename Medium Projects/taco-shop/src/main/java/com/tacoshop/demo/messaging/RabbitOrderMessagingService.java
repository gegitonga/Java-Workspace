package com.tacoshop.demo.messaging;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import com.tacoshop.demo.models.TacoOrder;
import com.tacoshop.demo.services.OrderMessagingService;


public class RabbitOrderMessagingService implements OrderMessagingService {
    private RabbitTemplate rabbitTemplate;

    @Autowired
    public RabbitOrderMessagingService(RabbitTemplate rabbitTemplate){
        this.rabbitTemplate = rabbitTemplate;
    }

    public void sendOrder(TacoOrder order){
        // MessageConverter converter = rabbitTemplate.getMessageConverter();
        // MessageProperties props = new MessageProperties();
        // Message message = converter.toMessage(order, props);
        // rabbitTemplate.send("tacocloud.order", message);
        rabbitTemplate.convertAndSend("tacocloud.order",order);
    }
    
}
