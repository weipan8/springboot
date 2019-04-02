package com.test.model;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

public class Employee {
	
	private Integer id;
	private String name;
	private Integer age;
	@JSONField(format="yyyy-MM-dd HH:mm:ss")
	private Date birthday;
	private Integer sex;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public Integer getSex() {
		return sex;
	}
	public void setSex(Integer sex) {
		this.sex = sex;
	}
	public Employee(Integer id, String name, Integer age, Date birthday, Integer sex) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.birthday = birthday;
		this.sex = sex;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
