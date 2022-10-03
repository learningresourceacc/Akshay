package com.example.demo;

import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Profile("dev")
@RestController
public class DevController {

	@RequestMapping("/")
	public String getMessage() {
		return "Hi, I am Develemont System Default Page";
	}
}
