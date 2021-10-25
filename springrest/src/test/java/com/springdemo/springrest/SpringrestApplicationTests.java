package com.springdemo.springrest;

import com.springdemo.springrest.dao.CourseDao;
import com.springdemo.springrest.entities.Course;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class SpringrestApplicationTests {

	@Autowired
	CourseDao cdao;


	@Test
	void contextLoads() {
	}

	@Test
	public void getCourses(){
		List list = cdao.findAll();
		assertThat(list).size().isGreaterThan(0);
	}

	@Test
	public void getCourse(){
		Course c= cdao.findById(102).get();
		assertEquals("Angular JS",c.getTitle());
	}

	@Test
	public void addCourse(){
		Course c = new Course();
		c.setId(103);
		c.setTitle("Java Spring Boot");
		c.setDescp("JSB");
		cdao.save(c);
		assertNotNull(cdao.findById(103).get());
	}

	@Test
	public void updateCourse(){
		Course c = cdao.findById(103).get();
		c.setTitle("Flutter Development");
		c.setDescp("Facebook Flutter");
		cdao.save(c);
		assertNotEquals("JSB",cdao.findById(103).get().getDescp());
	}

	@Test
	public void deleteCourse(){
		cdao.deleteById(103);
		assertThat(cdao.existsById(103)).isFalse();
	}


}
