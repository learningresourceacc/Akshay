package com.example.demoJPA.Entities;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Course {

	@Id
	@Column(name="course_id")
	private int courseId;
	
	private String title;
	
	private int duration;
	
	@ManyToOne
	@JoinColumn(name = "instructor",referencedColumnName = "id")
	private Instructor instructor;

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public Instructor getInstructor() {
		return instructor;
	}

	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}

	public Course(int courseId, String title, int duration, Instructor instructor) {
		super();
		this.courseId = courseId;
		this.title = title;
		this.duration = duration;
		this.instructor = instructor;
	}

	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
