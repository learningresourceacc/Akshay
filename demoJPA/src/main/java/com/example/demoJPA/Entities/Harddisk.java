package com.example.demoJPA.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Harddisk {

	@Id
	private int id;
	
	private int size;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public Harddisk(int id, int size) {
		super();
		this.id = id;
		this.size = size;
	}

	public Harddisk() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
