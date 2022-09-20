package com.example.demoJPA.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demoJPA.Repo.LaptopRepo;
import com.example.demoJPA.Entities.*;

@Service
public class LaptopService {

	@Autowired
	LaptopRepo dao;
	
	public List<Laptop> getAllLaptops(){
		return (List<Laptop>) dao.findAll();
	}
}
