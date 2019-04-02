package com.test.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;

import com.test.model.Student;


public interface StudentDao extends JpaRepository<Student, Integer>{
	
	Student findByName(String name);
	
	Page<Student> findAll(Specification<Student> spe,Pageable page);
	
}
