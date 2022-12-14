package com.microservice.example.orderservices.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.microservice.example.orderservices.common.PaymentTO;
import com.microservice.example.orderservices.common.TranscationRequest;
import com.microservice.example.orderservices.common.TranscationResponse;
import com.microservice.example.orderservices.dao.OrderDAO;
import com.microservice.example.orderservices.entity.OrderTO;

@Service
@RefreshScope
public class OrderService {

	@Autowired
	OrderDAO daoLayer;
	
	@Autowired
	@Lazy
	RestTemplate restTemplate;
	/*
	 * @Value("${restTemplate.payment.save}") private String savePayment;
	 */
	
	
	

	public TranscationResponse saveOrder(TranscationRequest obj) {
		TranscationResponse response = new TranscationResponse();
		PaymentTO pay = obj.getPayment();
		OrderTO order = obj.getOrder();
		pay.setPaymentId(order.getOrderId()+1);
		pay.setOrderId(obj.getOrder().getOrderId());
		PaymentTO payy = restTemplate.postForObject("http://PAYMENT-SERVICE/payment/savePayment", pay, PaymentTO.class);
		if (payy != null && payy.getPaymentId() != 0)
		{
			daoLayer.save(order);
			response.setOrderId(order.getOrderId());
			response.setPaymentId(payy.getPaymentId());
			response.setTranscationId(payy.getTrancId());
		}
			return response;

	}

}
