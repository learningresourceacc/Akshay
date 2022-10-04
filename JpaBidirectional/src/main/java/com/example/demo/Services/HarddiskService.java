package com.example.demo.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entities.Harddisk;
import com.example.demo.Repo.HarddiskDao;

@Service
public class HarddiskService {
	
	@Autowired
	HarddiskDao dao;

	public List<Harddisk> findAllHarddisk(){
		return dao.findAll();
	}
	
	public Harddisk findHardiskById(long id) {
		Optional<Harddisk> harddisk=dao.findById(id);
		return harddisk.get();
	}
	
	public void addHarddisk(Harddisk harddisk) {
		dao.save(harddisk);
	}
}
