package com.example.demo.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entities.Laptop;
import com.example.demo.Services.LaptopService;

@RestController
public class LaptopController {

	@Autowired
	LaptopService service;
	
	@GetMapping("/getAllLaptops")
	public ResponseEntity<Object> getAllLaptops(){
		 List list=service.findAllLaptops();
		return new ResponseEntity<Object>(list, HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/getLaptop/{id}")
	public ResponseEntity<Object> getLaptopById(@PathVariable long id){
		return new ResponseEntity<Object>(service.findLaptopById(id),HttpStatus.ACCEPTED);
	}
	
	@PostMapping("/addLaptop")
	public ResponseEntity<Object> addLaptop(@RequestBody Laptop laptop){
		service.addLaptop(laptop);
		return new ResponseEntity<Object>
		("Laptop added successfully with id "+laptop.getLaptopId(),HttpStatus.CREATED);
		
	}
	
}
