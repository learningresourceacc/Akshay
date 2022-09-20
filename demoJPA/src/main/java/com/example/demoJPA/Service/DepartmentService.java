package com.example.demoJPA.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demoJPA.Entities.Department;
import com.example.demoJPA.Entities.Instructor;
import com.example.demoJPA.Repo.DepartmentRepo;
import com.example.demoJPA.Repo.InstructorRepo;


@Service
public class DepartmentService {

	@Autowired
	DepartmentRepo instructor;
	
	public List<Department> getAllDepartments(){
		return (List<Department>) instructor.findAll();
	}
	
}
