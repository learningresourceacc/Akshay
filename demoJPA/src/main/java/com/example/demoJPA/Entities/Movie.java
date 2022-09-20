package com.example.demoJPA.Entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;

@Entity
public class Movie {

	@Id
	private int mid;
	
	private String name;

	public int getMid() {
		return mid;
	}

	public void setMid(int mid) {
		this.mid = mid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Movie(int mid, String name) {
		super();
		this.mid = mid;
		this.name = name;
	}

	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
