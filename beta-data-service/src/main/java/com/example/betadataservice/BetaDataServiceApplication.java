package com.example.betadataservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class BetaDataServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BetaDataServiceApplication.class, args);
	}

}
