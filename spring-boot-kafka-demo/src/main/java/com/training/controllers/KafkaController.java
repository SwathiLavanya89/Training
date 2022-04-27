package com.training.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.training.model.Order;

//import com.training.model.Order;

import com.training.services.KafkaProducerService;

@RestController
public class KafkaController {

	@Autowired
	private KafkaProducerService kafkaService;
	
	
	@GetMapping("/message/{message}")
	public String publishMessage(@PathVariable("message") String message)
	{
		return kafkaService.publishMessage(message);
	}
	
	
	  @PostMapping("/order") 
	  public String publishOrder(@RequestBody List<Order>
	  orders) { 
		  return kafkaService.publishOrder(orders); 
		  }
	 
}
