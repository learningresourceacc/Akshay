package com.example.demoJPA.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demoJPA.Service.CourseService;
import com.example.demoJPA.Service.PersonService;
import com.example.demoJPA.Entities.Course;
import com.example.demoJPA.Entities.Person;

@RestController
public class PersonController {

	@Autowired
	PersonService service;

	@GetMapping("/Persons")
	public List<Person> getAllCourse() {
		return service.getAllCourses();
	}
}
