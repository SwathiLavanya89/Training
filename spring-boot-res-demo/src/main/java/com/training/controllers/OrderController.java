package com.training.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.training.model.Order;
import com.training.services.OrderService;

@RestController
public class OrderController {

	@Autowired
	private OrderService orderService;
	
	@GetMapping("/order/isbn/{isbn}/qty/{qty}")
	public Order createOrder(@PathVariable("isbn") Long isbn,@PathVariable("qty") int qty)
	{
		return orderService.createOrder(isbn, qty);
	}
}
