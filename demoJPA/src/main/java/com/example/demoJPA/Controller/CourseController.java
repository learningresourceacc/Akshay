package com.example.demoJPA.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demoJPA.Service.CourseService;

import com.example.demoJPA.Entities.Course;

@RestController
public class CourseController {

	@Autowired
	CourseService service;

	@GetMapping("/Courses")
	public List<Course> getAllCourse() {
		return service.getAllCourses();
	}
}
