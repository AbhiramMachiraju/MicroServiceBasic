package com.microservice.example.paymentservices.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.microservice.example.paymentservices.entity.PaymentTO;

public interface PaymentDAO extends JpaRepository<PaymentTO,Integer> {

}
