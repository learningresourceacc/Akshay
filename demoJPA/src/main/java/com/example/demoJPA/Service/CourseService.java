package com.example.demoJPA.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demoJPA.Entities.Course;
import com.example.demoJPA.Repo.*;


@Service
public class CourseService {

	@Autowired
	CourseRepo dao;
	
	public List<Course> getAllCourses(){
		return (List<Course>) dao.findAll();
	}
}
