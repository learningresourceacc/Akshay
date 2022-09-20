package com.example.demoJPA.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Admin {

	@GetMapping("/admin")
	public String adminMessage() {
		return "Welcome Admin";
	}
}
