package com.example.demoJPA.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Laptop {

	@Id
	private int id;
	
	private String name;
	
	@OneToOne
	@JoinColumn(name="harddisk")
	private Harddisk harddisk;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Harddisk getHarddisk() {
		return harddisk;
	}

	public void setHarddisk(Harddisk harddisk) {
		this.harddisk = harddisk;
	}

	public Laptop(int id, String name, Harddisk harddisk) {
		super();
		this.id = id;
		this.name = name;
		this.harddisk = harddisk;
	}

	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
