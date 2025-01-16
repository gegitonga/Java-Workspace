package com.tacoshop.demo.services;

import com.tacoshop.demo.models.TacoOrder;

public interface OrderMessagingService {
    void sendOrder(TacoOrder order);
}
