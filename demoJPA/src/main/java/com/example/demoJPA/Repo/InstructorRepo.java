package com.example.demoJPA.Repo;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demoJPA.Entities.Instructor;

@Repository
public interface InstructorRepo extends CrudRepository<Instructor, Integer> {

}
