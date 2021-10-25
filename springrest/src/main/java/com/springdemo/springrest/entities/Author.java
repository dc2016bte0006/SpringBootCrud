package com.springdemo.springrest.entities;

public class Author {
	private String name;
	private int id;
	
	public Author(int id,String name ) {
		super();
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Authors [name=" + name + ", id=" + id + "]";
	}
	
	
}
