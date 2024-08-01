package com.example.gammadataservice.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="alpha-data-service")
public interface AlphaDataServiceClient {
	
	@GetMapping("/alphadataservice/hello")
    String hello();
}
