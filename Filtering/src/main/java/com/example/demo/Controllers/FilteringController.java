package com.example.demo.Controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entities.Employee;
import com.example.demo.Entities.User;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;

@RestController
public class FilteringController {

	//Static Filtering to filter out the password filed of User
	@GetMapping("/")
	public List<User> getAllUsers(){
		List<User> users=List.of(
				new User("akshay","akshay","admin"),
				new User("aravind","aravind","user"),
				new User("siddanna","siddanna","other")
				);
		return users;
	}
	
	@GetMapping("/getAllEmployess")
	public MappingJacksonValue getAllEmployess()  
	{  
	Employee employee=new Employee(1,"akshay","delhi");
	
	//invoking static method filterOutAllExcept()  
	SimpleBeanPropertyFilter filter=SimpleBeanPropertyFilter.filterOutAllExcept("id", "name"); 
	
	//creating filter using FilterProvider class  
	FilterProvider filters=new SimpleFilterProvider().addFilter("EmployeeFilter",filter); 
	
	//constructor of MappingJacksonValue class  that has bean as constructor argument  
	MappingJacksonValue mapping = new MappingJacksonValue(employee);  
	
	//configuring filters  
	mapping.setFilters(filters);  
	
	return mapping;  
	}  
	
	@GetMapping("/getEmployesAddress")
	public MappingJacksonValue getEmployesAddress()  
	{  
	Employee employee=new Employee(1,"akshay","delhi");
	
	//invoking static method filterOutAllExcept()  
	SimpleBeanPropertyFilter filter=SimpleBeanPropertyFilter.filterOutAllExcept("name", "address"); 
	
	//creating filter using FilterProvider class  
	FilterProvider filters=new SimpleFilterProvider().addFilter("EmployeeFilter",filter); 
	
	//constructor of MappingJacksonValue class  that has bean as constructor argument  
	MappingJacksonValue mapping = new MappingJacksonValue(employee);  
	
	//configuring filters  
	mapping.setFilters(filters);  
	
	return mapping;  
	}  
}
