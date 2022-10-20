package com.example.demo.Versioning;


public class Version2 {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Version2 [name=" + name + "]";
	}

	public Version2(String name) {
		super();
		this.name = name;
	}

	public Version2() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
