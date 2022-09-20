package com.microservice.example.orderservices.common;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class PaymentTO {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
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
	@Override
	public String toString() {
		return "PaymentTO [paymentId=" + paymentId + ", status=" + status + ", trancId=" + trancId + ", orderId="
				+ orderId + "]";
	}
	
	
	
	
}
