package com.example.demoJPA.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.example.demoJPA.Entities.Student;

public interface StudentRepo extends CrudRepository<Student, Integer> {

}
