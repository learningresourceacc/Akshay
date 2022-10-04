package com.example.demo.Entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.springframework.context.annotation.Lazy;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Laptop {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long laptopId;
	
	private String name;
	
	@OneToOne(mappedBy="laptop",cascade = CascadeType.ALL)
	private Harddisk harddisk;

	public long getLaptopId() {
		return laptopId;
	}

	public void setLaptopId(long laptopId) {
		this.laptopId = laptopId;
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

	@Override
	public String toString() {
		return "Laptop [laptopId=" + laptopId + ", name=" + name + ", harddisk=" + harddisk + "]";
	}

	public Laptop(long laptopId, String name, Harddisk harddisk) {
		super();
		this.laptopId = laptopId;
		this.name = name;
		this.harddisk = harddisk;
	}

	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
