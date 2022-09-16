package com.example.demoJPA.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class RouteController {

	@RequestMapping("login")
	public String loginPage() {
		return "login";
	}
}
