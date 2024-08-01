package com.example.gammadataservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.gammadataservice.client.AlphaDataServiceClient;
import com.example.gammadataservice.client.BetaDataServiceClient;

@RestController
@RequestMapping("/gammadataservice")
public class GammaDataServiceController {
	
	@Autowired
    private AlphaDataServiceClient alphaDataServiceClient;
	
	@Autowired
    private BetaDataServiceClient betaDataServiceClient;
    
	@GetMapping("/hello")
    public String hello() {
        String alphaDataServiceResponse = alphaDataServiceClient.hello();
        String betaDataServiceResponse = betaDataServiceClient.hello();
		return String.format("GammaDataService received: %s and %s", alphaDataServiceResponse, betaDataServiceResponse);
    }
    
    
}
