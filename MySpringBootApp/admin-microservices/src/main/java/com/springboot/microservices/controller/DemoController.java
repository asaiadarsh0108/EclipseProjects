package com.springboot.microservices.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	@GetMapping("/admin")
	public String getAdmin() {
		return "Hello admin this Admin Microservices";
	}

}
