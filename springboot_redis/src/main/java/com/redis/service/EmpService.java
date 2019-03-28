package com.redis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.test.entity.Emp;
import com.test.mapper.EmpMapper;

@Service
public class EmpService {
	
	@Autowired
	private EmpMapper mapper;
	
	
	@Cacheable(value="emps")
	public List<Emp> findEmps(){
		
		return mapper.findEmps();
	}
	

}
