package com.example.demoJPA.Entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity
public class Person {

	@Id
	private int id;
	
	private String name;
	
	@ManyToMany
	@JoinTable(name="person_movie",
	joinColumns = @JoinColumn(name="id"),
	inverseJoinColumns = @JoinColumn(name="mid"))
	private List<Movie> movies;

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

	public List<Movie> getMovies() {
		return movies;
	}

	public void setMovies(List<Movie> movies) {
		this.movies = movies;
	}

	public Person(int id, String name, List<Movie> movies) {
		super();
		this.id = id;
		this.name = name;
		this.movies = movies;
	}

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	} 
	
	
	
}
