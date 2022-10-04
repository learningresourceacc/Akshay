package com.example.demo.Entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Harddisk {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long harddiskId;
	
	private int size;
	
	private String brand;
	
	@OneToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name="laptop_details",referencedColumnName = "laptopId")
	private Laptop laptop;

	public long getHarddiskId() {
		return harddiskId;
	}

	public void setHarddiskId(long harddiskId) {
		this.harddiskId = harddiskId;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

//	public Laptop getLaptop() {
//		return laptop;
//	}

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}

	@Override
	public String toString() {
		return "Harddisk [harddiskId=" + harddiskId + ", size=" + size + ", brand=" + brand + ", laptop=" + laptop
				+ "]";
	}

	public Harddisk(long harddiskId, int size, String brand, Laptop laptop) {
		super();
		this.harddiskId = harddiskId;
		this.size = size;
		this.brand = brand;
		this.laptop = laptop;
	}

	public Harddisk() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
