package com.example.demoJPA.Repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demoJPA.Entities.Person;

@Repository
public interface PersonRepo extends CrudRepository<Person, Integer>{

}
