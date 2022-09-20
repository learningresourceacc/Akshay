package com.example.demoJPA.Repo;

import org.springframework.data.repository.CrudRepository;

import com.example.demoJPA.Entities.Course;

public interface CourseRepo extends CrudRepository<Course, Integer> {
	
}
