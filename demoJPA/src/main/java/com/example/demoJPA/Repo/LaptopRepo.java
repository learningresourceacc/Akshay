package com.example.demoJPA.Repo;

import org.springframework.data.repository.CrudRepository;

import com.example.demoJPA.Entities.Laptop;

public interface LaptopRepo extends CrudRepository<Laptop, Integer>{

}
