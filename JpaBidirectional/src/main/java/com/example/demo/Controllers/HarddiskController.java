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

import com.example.demo.Entities.Harddisk;
import com.example.demo.Services.HarddiskService;

@RestController
public class HarddiskController {

	@Autowired
	HarddiskService service;
	
	@GetMapping("/getAllHarddisks")
	public ResponseEntity<Object> getAllHarddisks(){
		 List list=service.findAllHarddisk();
		return new ResponseEntity<Object>(list, HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/getHarddisk/{id}")
	public ResponseEntity<Object> getHarddiskById(@PathVariable long id){
		return new ResponseEntity<Object>(service.findHardiskById(id),HttpStatus.ACCEPTED);
	}
	
	@PostMapping("/addHarddisk")
	public ResponseEntity<Object> addHarddisk(@RequestBody Harddisk harddisk){
		service.addHarddisk(harddisk);
		return new ResponseEntity<Object>
		("Harddisk added successfully with id "+harddisk.getHarddiskId(),HttpStatus.CREATED);
		
	}
	
}
