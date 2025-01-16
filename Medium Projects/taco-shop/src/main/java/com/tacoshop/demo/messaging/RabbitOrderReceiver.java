package com.tacoshop.demo.messaging;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.stereotype.Component;
import org.springframework.amqp.core.Message;

import com.tacoshop.demo.models.TacoOrder;


@Component
public class RabbitOrderReceiver {
    private RabbitTemplate rabbitTemplate;
    private MessageConverter messageConverter;

    public RabbitOrderReceiver(RabbitTemplate rabbitTemplate){
        this.rabbitTemplate = rabbitTemplate;
        this.messageConverter = rabbitTemplate.getMessageConverter();
    }

    public TacoOrder receiveOrder(){
        // Message message = rabbitTemplate.receive("tacocloud.order");
        // return message != null ? (TacoOrder) messageConverter.fromMessage(message): null;
        return (TacoOrder) rabbitTemplate.receiveAndConvert("tacocloud.order.queue");
    }
}
