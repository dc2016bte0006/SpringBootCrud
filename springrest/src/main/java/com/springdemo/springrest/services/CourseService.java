package com.springdemo.springrest.services;
import java.util.List;

import com.springdemo.springrest.entities.*;

public interface CourseService {
	public List<Course> getCourses();
	
	public Course getCourse(int courseId);

	public Course addCourse(Course course);

	public Course updateCourse(Course course);

	public void deleteCourse(int courseId);
}
