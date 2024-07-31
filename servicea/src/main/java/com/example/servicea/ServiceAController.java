package com.example.servicea;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/servicea")
public class ServiceAController {
	
	@GetMapping("/hello")
    public String hello() {
        return "Hello from Service a";
    }

}
