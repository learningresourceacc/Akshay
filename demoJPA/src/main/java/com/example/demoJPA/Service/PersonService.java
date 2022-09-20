package com.example.demoJPA.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demoJPA.Entities.Course;
import com.example.demoJPA.Entities.Person;
import com.example.demoJPA.Repo.*;


@Service
public class PersonService {

	@Autowired
	PersonRepo dao;
	
	public List<Person> getAllCourses(){
		return (List<Person>) dao.findAll();
	}
}
