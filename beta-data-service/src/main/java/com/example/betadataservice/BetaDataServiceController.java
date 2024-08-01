package com.example.betadataservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/betadataservice")
public class BetaDataServiceController {
	
	@GetMapping("/hello")
    public String hello() {
        return "Hello from BetaDataService";
    }
}
