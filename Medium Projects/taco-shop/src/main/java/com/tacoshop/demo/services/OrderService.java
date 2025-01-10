package com.tacoshop.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.tacoshop.demo.models.TacoOrder;
import com.tacoshop.demo.models.User;
import com.tacoshop.demo.repository.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository orderRepository;
	
	public Optional<TacoOrder> findById(Long id){
		return orderRepository.findById(id);
	}

	public List<TacoOrder> findByUserOrderByPlacedAtDesc(User user, Pageable pageable){
		return orderRepository.findByUserOrderByPlacedAtDesc(user, pageable);
	}

	public TacoOrder saveOrder(TacoOrder order){
		return orderRepository.save(order);
	}

	public void deleteOrder(Long id){
		orderRepository.deleteById(id);
	}
	
}
