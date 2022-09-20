package com.microservice.example.apiGateway.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

@RestController
public class FallbackController {
	
	
	@RequestMapping("/orderFallback")
	public Mono<String> orderServiceCallBack()
	{
		return Mono.just("Order Service is  taking too long to respond or is down.Please try again after sometimrs..");
	}

	@RequestMapping("/paymentFallback")
	public Mono<String> paymentFallback()
	{
		return Mono.just("Payment Service is  taking too long to respond or is down.Please try again after sometimrs..");
	}
}
