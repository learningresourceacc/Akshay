package com.example.demoJPA.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demoJPA.Service.DepartmentService;

import com.example.demoJPA.Entities.*;

@RestController
public class DepartmentController {

	@Autowired
	DepartmentService service;
	
	@GetMapping("/Departments")
	public List<Department> getAllDepartments(){
		return service.getAllDepartments();
	}
}
