package com.microservice.example.paymentservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
//@EnableEurekaClient
public class PaymentservicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(PaymentservicesApplication.class, args);
	}

}