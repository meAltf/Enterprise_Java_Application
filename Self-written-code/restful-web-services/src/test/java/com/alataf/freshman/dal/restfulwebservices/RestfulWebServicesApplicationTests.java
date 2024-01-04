package com.alataf.freshman.dal.restfulwebservices;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.alataf.freshman.dal.restfulwebservices.entities.Student;
import com.alataf.freshman.dal.restfulwebservices.repos.StudentRepository;


@SpringBootTest
class RestfulWebServicesApplicationTests {

	@Autowired
	private StudentRepository repo;
	
	@Test
	void StudentRepository() {
		Student student = new Student();
		student.setName("Alataf");
		student.setCourse("Serverless using AWS Lambda");
		student.setFee(400d);
		repo.save(student);
	}
	
	@Test
	void testFindStudentById() {
		Student student= repo.findById(1l).get();
		System.out.println(student);
	}
	
	@Test
	void testUpdateStudent() {
		Student student = repo.findById(1l).get();
		student.setFee(500d);
		repo.save(student);
		
	}
	
	@Test
	void testDeleteStudent() {
		Student student = repo.findById(1l).get();
		repo.delete(student);
	}
}
