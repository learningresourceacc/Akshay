package com.example.demo.Versioning;

public class Version1 {

	private Name name;

	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Version1 [name=" + name + "]";
	}

	public Version1(Name name) {
		super();
		this.name = name;
	}

	public Version1() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
