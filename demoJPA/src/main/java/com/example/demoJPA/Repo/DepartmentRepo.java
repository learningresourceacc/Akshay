package com.example.demoJPA.Repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demoJPA.Entities.Department;

@Repository
public interface DepartmentRepo extends CrudRepository<Department, Integer> {
	
}
