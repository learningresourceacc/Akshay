package com.example.demoJPA.Entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity
public class Department {

	@Id
	private int dep_id;
	
	private String name;
	
	
	@OneToMany
	@JoinColumn(name="dep_id")
	private List<Section> sections;


	public int getDep_id() {
		return dep_id;
	}


	public void setDep_id(int dep_id) {
		this.dep_id = dep_id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public List<Section> getSections() {
		return sections;
	}


	public void setSections(List<Section> sections) {
		this.sections = sections;
	}


	public Department(int dep_id, String name, List<Section> sections) {
		super();
		this.dep_id = dep_id;
		this.name = name;
		this.sections = sections;
	}


	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
