package com.tacoshop.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import com.tacoshop.demo.models.TacoOrder;
import com.tacoshop.demo.models.User;
import com.tacoshop.demo.services.OrderService;

import lombok.extern.slf4j.Slf4j;


@Slf4j
@Controller
@RequestMapping("/orders")
@SessionAttributes("tacoOrder")
public class OrderController {

	private OrderProps orderProps;
	private OrderService orderService;

	public OrderController(OrderService orderService,OrderProps orderProps){
		this.orderService = orderService;
		this.orderProps = orderProps;
	}

	@GetMapping("/current")
	public String orderForm() {
		return "orderForm";
	}

	@GetMapping
	public String ordersForUser(@AuthenticationPrincipal User user, Model model) {
		Pageable pageable = PageRequest.of(0, orderProps.getPageSize());
		model.addAttribute("orders", orderService.findByUserOrderByPlacedAtDesc(user, pageable));

		return "orderList";
	}
	

	@PostMapping
	public String processOrder(TacoOrder order, SessionStatus sessionStatus) {
		log.info("Order submitted: {}", order);
		sessionStatus.setComplete();
		return "redirect:/";
	}
}
