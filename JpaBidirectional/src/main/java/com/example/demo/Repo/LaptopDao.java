package com.example.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entities.Laptop;

public interface LaptopDao extends JpaRepository<Laptop, Long>{

}
