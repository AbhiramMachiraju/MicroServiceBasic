package com.microservice.example.orderservices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.example.orderservices.common.TranscationRequest;
import com.microservice.example.orderservices.common.TranscationResponse;
import com.microservice.example.orderservices.entity.OrderTO;
import com.microservice.example.orderservices.service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {

	
	@Autowired OrderService serviceLyer;
	
	@GetMapping("/OrderServiceStatus")
	public String status()
	{
		return "ORDER SERVICE IS UP";
	}
	
	
	@PostMapping("/bookOrder")
	public TranscationResponse bookOrder(@RequestBody TranscationRequest obj)
	{
		
		return  serviceLyer.saveOrder(obj);
	}
	
}
