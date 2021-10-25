package com.springdemo.springrest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springdemo.springrest.entities.Course;

public interface CourseDao extends JpaRepository<Course, Integer>{
	
}
