package com.springdemo.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springdemo.springrest.entities.Author;
import com.springdemo.springrest.entities.Course;
import com.springdemo.springrest.services.AuthorService;
import com.springdemo.springrest.services.CourseService;

@RestController
public class MyController {
	
	@Autowired
	private AuthorService auth;
	
	@Autowired
	private CourseService cserv;
	
	
	
	@GetMapping("/home")
	public String home() {
		return "This is home page";
	}
	
	//get the courses
	@GetMapping("/courses")
	public List<Course> getCourses(){
		return this.cserv.getCourses();
	}
	
	//get a single course
	@GetMapping("/courses/{courseId}")
	public Course getCourse(@PathVariable int courseId) {
		return this.cserv.getCourse(courseId);
	}
	
	//post a new course
	@PostMapping("/courses")
	public Course addCourse(@RequestBody Course course) {
		return this.cserv.addCourse(course);
	}
	
	//update existing course
	@PutMapping("/courses")
	public Course updateCourse(@RequestBody Course course){
		return this.cserv.updateCourse(course);
		
	}
	
	@DeleteMapping("/courses/{courseId}")
	public void deleteCourse(@PathVariable int courseId) {
		this.cserv.deleteCourse(courseId);
	}
	
	
	@GetMapping("/authors")
	public List<Author> getAuthors(){
		return this.auth.getAuthors();
	}
	
	@GetMapping("authors/{authorId}")
	public Author getAuthor(@PathVariable int authorId) {
		return this.auth.getAuthor(authorId);
	}
	
	@PostMapping("authors")
	public Author addAuthor(@RequestBody Author author) {
		return this.auth.addAuthor(author);
	}
	
	@PutMapping("authors")
	public Author updateAuthor(@RequestBody Author author) {
		return this.auth.updateAuthor(author);
	}
	
	@DeleteMapping("authors/{authorId}")
	public void deleteAuthor(@PathVariable int authorId) {
		this.auth.deleteAuthor(authorId);
	}
}
