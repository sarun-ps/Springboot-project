package com.project.repository;

import org.springframework.data.repository.CrudRepository;

import com.project.model.Student;

public interface Repository extends CrudRepository<Student,Integer>{
	
}
