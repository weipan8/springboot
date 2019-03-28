package com.redis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.redis.service.EmpService;

@RestController
public class EmpController {
	
	
	@Autowired
	private EmpService service;
	
	@GetMapping("/getemps")
	public Object getEmps(){
		
		return service.findEmps();
	}
}
