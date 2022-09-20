package com.microservice.example.orderservices.common;

import com.microservice.example.orderservices.entity.OrderTO;

public class TranscationRequest {
	
	
	private PaymentTO payment;
	private OrderTO order;
	public PaymentTO getPayment() {
		return payment;
	}
	public void setPayment(PaymentTO payment) {
		this.payment = payment;
	}
	public OrderTO getOrder() {
		return order;
	}
	public void setOrder(OrderTO order) {
		this.order = order;
	}
	
	
	
	

}
