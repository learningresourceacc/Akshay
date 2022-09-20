package com.example.demoJPA.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demoJPA.Service.LaptopService;
import com.example.demoJPA.Entities.*;

@RestController
public class LaptopController {

	@Autowired
	LaptopService service;
	
	@GetMapping("/Laptops")
	public List<Laptop> getAllLaptops(){
		return service.getAllLaptops();
	}
}
