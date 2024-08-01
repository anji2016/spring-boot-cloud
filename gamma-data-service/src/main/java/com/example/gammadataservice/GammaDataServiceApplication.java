package com.example.gammadataservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.gammadataservice.client", "com.example.gammadataservice.controller"})
@EnableDiscoveryClient
@EnableFeignClients
public class GammaDataServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(GammaDataServiceApplication.class, args);
	}
	
}
