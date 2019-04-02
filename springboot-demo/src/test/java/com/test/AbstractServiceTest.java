package com.test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.test.service.EmployeeService;
import com.test.service.StudentService;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public  class AbstractServiceTest {

    @Autowired
    protected StudentService services;
    @Autowired
    protected EmployeeService employeeService;
    
    @Test
    public void test01(){
    	
    	System.out.println(JSON.toJSONString(services.getAllStudents(),true));
 
    }
    
    @Test
    public void test02(){
    	
    	System.out.println(JSON.toJSONString(employeeService.getEmps(),true));
 
    }
    
    public static void main(String[] args) {
		
	}

}