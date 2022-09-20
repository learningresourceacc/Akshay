package com.example.demoJPA.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Section {

	@Id
	@Column(name="sid")
	private int section_id;
	
	private String name;

	public Section(int section_id, String name) {
		super();
		this.section_id = section_id;
		this.name = name;
	}

	public int getSection_id() {
		return section_id;
	}

	public void setSection_id(int section_id) {
		this.section_id = section_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Section() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
