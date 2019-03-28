package com.test.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.test.entity.Emp;
import com.test.mapper.EmpMapper;

@RestController
public class Controller {

	//private static final Logger logger = Logger.getLogger(Controller.class);

	@Autowired
	private EmpMapper empMapper;
	
	
	@RequestMapping(value="/getEmps",method=RequestMethod.GET)
	public Map<String, List<Emp>> getEmps(){
		List<Emp> emps = empMapper.findEmps();
		Map<String, List<Emp>> map=new HashMap<String, List<Emp>>();
		map.put("data", emps);
		return map;
	}
	
	@RequestMapping("/exception")
	public int Exception(){
		System.out.println("进入Exception....");
		return 5/0;
	}
	
	
	/*@RequestMapping("/async")
	public String async(){
		test();
		return "SUCCESS";
	}

	@Async
	private void test(){
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
		}
	}*/
}
