package com.test.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.test.model.Student;

public interface StudentService {
	
	public Student getStudentByName(String name);
	
	public Student getStudentById(int id);
	
	public List<Student> getAllStudents();
	
	public Student saveAndFlush(Student stu);
	
	public void save(Student stu);
	
	public Page<Student> getStudens4Page(int pageno,int pagesize);
	
	public Page<Student> getStudens4PageAndQuery(int pageno,int pagesize,Student bookQuery);
	
	public void updateStudent(Student stu);
	
	public void del(int id);

}
