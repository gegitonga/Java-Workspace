package com.ordersystem.orderservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ordersystem.orderservice.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
