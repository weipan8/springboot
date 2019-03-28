package com.test.config;

import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


//@PropertySource(value = {"classpath:classtest.properties"},encoding="utf-8")
@Component
@ConfigurationProperties(prefix = "class")
public class ClassConfig {
	
	//@Value("${class.name}")
	private String name="";
	private int id=0;
	private List<String> teacher=null;
	private Student stu=null;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public List<String> getTeacher() {
		return teacher;
	}
	public void setTeacher(List<String> teacher) {
		this.teacher = teacher;
	}
	public Student getStu() {
		return stu;
	}
	public void setStu(Student stu) {
		this.stu = stu;
	}
	
	
	

}
