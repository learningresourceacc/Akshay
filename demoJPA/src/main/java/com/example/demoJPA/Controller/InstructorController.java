package com.example.demoJPA.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demoJPA.Service.InstructorService;
import com.example.demoJPA.Entities.Instructor;

@RestController
public class InstructorController {

	@Autowired
	InstructorService service;
	
	@GetMapping("/Instructor")
	public List<Instructor> getAllInstructors(){
		return service.getAllInstructors();
	}
	
	@GetMapping("/Instructor/{id}")
	public Optional<Instructor> getInstructorById(@PathVariable int id){
		return service.getInstructorById(id);
	}
}
