package com.springdemo.springrest.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Course {

	@Id
	private int id;
	private String title;
	private String descp;
	
	public Course(int id, String title, String descp) {
		super();
		this.id = id;
		this.title = title;
		this.descp = descp;
	}
	
	

	public Course() {
		super();
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescp() {
		return descp;
	}

	public void setDescp(String descp) {
		this.descp = descp;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", title=" + title + ", descp=" + descp + "]";
	}
	
	
	
	
}
