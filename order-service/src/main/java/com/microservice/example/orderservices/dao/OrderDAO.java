package com.microservice.example.orderservices.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.microservice.example.orderservices.entity.OrderTO;

public interface OrderDAO extends JpaRepository<OrderTO,Integer> {

}
