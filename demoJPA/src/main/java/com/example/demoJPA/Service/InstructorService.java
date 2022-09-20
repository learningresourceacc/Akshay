package com.example.demoJPA.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demoJPA.Entities.Instructor;
import com.example.demoJPA.Repo.InstructorRepo;


@Service
public class InstructorService {

	@Autowired
	InstructorRepo instructor;
	
	public List<Instructor> getAllInstructors(){
		return (List<Instructor>) instructor.findAll();
	}
	
	public Optional<Instructor> getInstructorById(int id) {
		return instructor.findById(id);
	}
}
