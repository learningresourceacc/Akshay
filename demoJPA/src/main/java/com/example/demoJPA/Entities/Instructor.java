package com.example.demoJPA.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Instructor {

	@Id
	private int id;
	
	@Column(name="first_name")
	private String firstName;

	@Column(name="last_name")
	private String lastName;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirst() {
		return firstName;
	}

	public void setFirst(String first) {
		this.firstName = first;
	}

	public String getLast() {
		return lastName;
	}

	public void setLast(String last) {
		this.lastName = last;
	}

	public Instructor(int id, String first, String last) {
		super();
		this.id = id;
		this.firstName = first;
		this.lastName = last;
	}

	public Instructor() {
		super();
	}

	
}
