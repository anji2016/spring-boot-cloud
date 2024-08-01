package com.example.gammadataservice.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="beta-data-service")
public interface BetaDataServiceClient {
	@GetMapping("/betadataservice/hello")
    String hello();
}
