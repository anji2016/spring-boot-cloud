package com.example.cloud.gateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackController {

    @GetMapping("/alphadataservice")
    public String fallbackServiceA() {
        return "Fallback response: AlphaDataService is currently unavailable. Please try again later.";
    }
    
    @GetMapping("/betadataservice")
    public String fallbackServiceB() {
        return "Fallback response: BetaDataService is currently unavailable. Please try again later.";
    }
    
    @GetMapping("/gammadataservice")
    public String fallbackServiceC() {
        return "Fallback response: GammaDataService is currently unavailable. Please try again later.";
    }
}

