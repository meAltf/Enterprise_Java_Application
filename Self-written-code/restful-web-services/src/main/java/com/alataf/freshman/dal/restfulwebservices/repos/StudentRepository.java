package com.alataf.freshman.dal.restfulwebservices.repos;

import org.springframework.data.repository.CrudRepository;

import com.alataf.freshman.dal.restfulwebservices.entities.Student;

//Type of class for which this repository being created (It is entities) here Student
//The type of ID in student that is Long
//complete to create data access layer
public interface StudentRepository extends CrudRepository<Student, Long> {

}
