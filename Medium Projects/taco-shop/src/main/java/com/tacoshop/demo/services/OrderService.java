package com.tacoshop.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tacoshop.demo.models.TacoOrder;
import com.tacoshop.demo.repository.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository orderRepository;
	
	public Optional<TacoOrder> findById(Long id){
		return orderRepository.findById(id);
	}
	
}
