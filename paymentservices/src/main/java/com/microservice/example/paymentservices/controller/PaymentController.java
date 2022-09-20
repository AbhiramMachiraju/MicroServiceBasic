package com.microservice.example.paymentservices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.example.paymentservices.entity.PaymentTO;
import com.microservice.example.paymentservices.service.PaymentService;

@RestController
@RequestMapping("/payment")
public class PaymentController {

	
	@Autowired PaymentService serviceLyer;
	
	@GetMapping("/paymentServiceStatus")
	public String status()
	{
		return "PAYMENT SERVICE IS UP";
	}
	
	
	@PostMapping("/savePayment")
	public PaymentTO savePayment(@RequestBody PaymentTO to)
	{
		
		return  serviceLyer.savePayment(to);
	}
	
}
