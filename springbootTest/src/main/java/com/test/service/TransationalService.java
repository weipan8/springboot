package com.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.test.mapper.TableTestMapper;

//@Service
public class TransationalService {

	@Autowired
	private TableTestMapper testmapper;
	
	@Autowired
	private TransationalService service;
	
	@Transactional(readOnly=true)
	public void addtest1(){
		
		testmapper.addtest1("test");
	}
	
	@Transactional
	public void addall(){
		service.addtest1();
		testmapper.addtest2("test");
		int i=1/0;
	}
}
