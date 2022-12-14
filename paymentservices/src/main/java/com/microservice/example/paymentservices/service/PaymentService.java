package com.microservice.example.paymentservices.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservice.example.paymentservices.dao.PaymentDAO;
import com.microservice.example.paymentservices.entity.PaymentTO;

@Service
public class PaymentService {
	
	@Autowired PaymentDAO daoLayer;
	
	public PaymentTO savePayment(PaymentTO paymentTO)
	{
		try {
		paymentTO.setTrancId(UUID.randomUUID().toString());
		paymentTO.setStatus("SUCCESS");
		return daoLayer.save(paymentTO);
		}
		catch (Exception e) {
			paymentTO.setStatus("FAILED");
			e.printStackTrace();
		}
		
		return paymentTO;
	}

}
