package com.springdemo.springrest.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springdemo.springrest.dao.CourseDao;
import com.springdemo.springrest.entities.Course;

@Service
public class CourseServiceImpl implements CourseService {

	
	
	
//	
//	List<Course> list=new ArrayList<>();
//	
//	public CourseServiceImpl() {
//	list.add(new Course(123,"Java Full Stack","XYZ"));
//	list.add(new Course(321,"React JS","ABC"));
//}
//	
//	
//
//	@Override
//	public List<Course> getCourses() {
//		return list;
//	}
//
//	@Override
//	public Course getCourse(int courseId) {
//		Course c=null;
//		for(Course course:list) {
//			if(course.getId() == courseId) {
//				c=course;
//				break;
//			}
//				
//		}
//		return c;
//	}
//
//	@Override
//	public Course addCourse(Course course) {
//		list.add(course);
//		return course;
//		
//	}
//
//	@Override
//	public Course updateCourse(Course course) {
//		list.forEach(c->{
//			if(c.getId()==course.getId()) {
//				c.setTitle(course.getTitle());
//				c.setDescp(course.getDescp());
//			}
//		});
//		return course;
//		
//	}
//
//	@Override
//	public void deleteCourse(int courseId) {
//		list=list.stream().filter(c->c.getId()!=courseId).collect(Collectors.toList());
//		System.out.println("Successfully deleted");
//	}
	
	//--------------------------------------Using JPA------------------------------------------------------
	
	@Autowired
	private CourseDao courseDao;
	
	@Override
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		return courseDao.findAll();
	}

	@Override
	public Course getCourse(int courseId) {
		return courseDao.findById(courseId).get();
		
	}

	@Override
	public Course addCourse(Course course) {
		courseDao.save(course);
		return course;
	}

	@Override
	public Course updateCourse(Course course) {
		courseDao.save(course);
		return course;
	}

	@Override
	public void deleteCourse(int courseId) {
		Course entity=courseDao.getOne(courseId);
		courseDao.delete(entity);
		
	}
	

}
