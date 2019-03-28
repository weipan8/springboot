package com.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.config.MyDataSource;
import com.test.entity.Emp;
import com.test.enums.DataSourceType;
import com.test.testmapper.EmpNoneMapper;

@Service
public class TestService {
	
	@Autowired
	private EmpNoneMapper empNoneMapper;
	
	@MyDataSource(DataSourceType.TEST1)
	public List<Emp> getAllEmps(){
		
		return empNoneMapper.findEmps();
	}

}
