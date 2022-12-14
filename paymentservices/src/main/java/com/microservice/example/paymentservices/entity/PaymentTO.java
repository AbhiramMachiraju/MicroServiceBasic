package com.microservice.example.paymentservices.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="PAYMENT_TB")
public class PaymentTO {
	
	
	@Id
	private int paymentId;
	private String status;
	private String trancId;
	private int orderId;
	public int getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getTrancId() {
		return trancId;
	}
	public void setTrancId(String trancId) {
		this.trancId = trancId;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	
	
}
