package com.example.demo.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entities.Employee;
import com.example.demo.Services.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService service;

	@GetMapping("/getAllEmployees")
	public ResponseEntity<Object> getAllEmployees() {
		return new ResponseEntity<Object>(service.getAllEmployees(), HttpStatus.ACCEPTED);
	}

	@GetMapping("/getEmployee/{id}")
	public ResponseEntity<Object> getEmployeeById(@PathVariable int id) {
		return new ResponseEntity<Object>(service.getEmployeeById(id), HttpStatus.ACCEPTED);
	}
	
	@PostMapping("/saveEmployee")
	public ResponseEntity<Object> saveEmployee(@RequestBody Employee employee){
		return new ResponseEntity<Object>(service.saveEmployee(employee), HttpStatus.CREATED);
	}
	
	
}