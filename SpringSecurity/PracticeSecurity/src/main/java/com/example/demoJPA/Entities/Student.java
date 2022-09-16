package com.example.demoJPA.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {

	@Id
	private int sid;
	
	private String first;
	
	private String last;

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getFirstName() {
		return first;
	}

	public void setFirstName(String firstName) {
		this.first = firstName;
	}

	public String getLastName() {
		return last;
	}

	public void setLastName(String lastName) {
		this.last = lastName;
	}

	public Student(int sid, String firstName, String lastName) {
		super();
		this.sid = sid;
		this.first = firstName;
		this.last = lastName;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
