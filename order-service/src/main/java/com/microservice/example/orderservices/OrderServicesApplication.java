package com.microservice.example.orderservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient
//@EnableEurekaClient
public class OrderServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderServicesApplication.class, args);
	}
	
	@Bean
	@LoadBalanced // To read from cloud after register with eureka
	public RestTemplate restTemplate()
	{
		return new RestTemplate();
	}

}