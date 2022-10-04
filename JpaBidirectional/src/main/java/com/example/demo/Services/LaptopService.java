package com.example.demo.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entities.Laptop;
import com.example.demo.Repo.LaptopDao;

@Service
public class LaptopService {

	@Autowired
	LaptopDao dao;
	
	public List<Laptop> findAllLaptops(){
		return dao.findAll();
	}
	
	public Laptop findLaptopById(long id) {
		Optional<Laptop> object=dao.findById(id);
		return object.get();
	}
	
	public void addLaptop(Laptop laptop) {
		dao.save(laptop);
	}
}
