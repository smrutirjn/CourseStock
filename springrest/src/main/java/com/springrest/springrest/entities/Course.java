package com.springrest.springrest.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class Course {
	
	@Id
	private long Id;
	
	private String name;
	private String description;

	public Course(long id, String name, String description) {
		super();
		Id = id;
		this.name = name;
		this.description = description;
	}
	
	

	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}



	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	

	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	@Override
	public String toString() {
		return "Course [Id=" + Id + ", name=" + name + ", description=" + description + "]";
	}
	
	

}

