package com.dxc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@GetMapping("/hello")
	public String sayHello() {
		return "Hello from the controller";
	}
	
	//updated by another developer
	@GetMapping("/hi1")
	public String sayHello() {
		return "Hi from the controller";
	}

}
