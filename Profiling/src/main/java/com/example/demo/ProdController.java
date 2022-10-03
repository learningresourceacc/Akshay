package com.example.demo;

import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Profile("prod")
@RestController
public class ProdController {

	@RequestMapping("/")
	public String getMessage() {
		return "Hi, I am Production System Default Page";
	}
}
