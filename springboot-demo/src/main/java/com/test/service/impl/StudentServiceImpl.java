package com.test.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.test.dao.StudentDao;
import com.test.model.Student;
import com.test.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{

	
	@Autowired
	private StudentDao dao;
	
	@Override
	public Student getStudentByName(String name) {
		return dao.findByName(name);
	}

	@Override
	public Student getStudentById(int id) {
		return dao.findOne(id);
	}

	@Override
	public List<Student> getAllStudents() {
		return  dao.findAll();
	}

	@Override
	@Transactional
	public Student saveAndFlush(Student stu) {
		
		Student saveAndFlush = dao.saveAndFlush(stu);
		//System.out.println("添加后："+JSON.toJSONString(stu,true));
		return saveAndFlush;
	}

	@Override
	public void save(Student stu) {
		dao.save(stu);
		System.out.println("添加后："+JSON.toJSONString(stu,true));
	}

	@Override
	public Page<Student> getStudens4Page(int pageno, int pagesize) {
		
		return dao.findAll(new PageRequest(pageno-1, pagesize,Sort.Direction.ASC,"id"));
		
	}

	@Override
	public Page<Student> getStudens4PageAndQuery(int pageno, int pagesize, final Student bookQuery) {
		// TODO Auto-generated method stub
		
		return dao.findAll(new Specification<Student>() {

			@Override
			public Predicate toPredicate(Root<Student> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
				List<Predicate> list = new ArrayList<Predicate>();
				if(bookQuery.getName()!=null && !"".equals(bookQuery.getName())){
					list.add(cb.like(root.get("name").as(String.class), "%"+bookQuery.getName()+"%"));
				}
				
				if(bookQuery.getSex()!=null && !"".equals(bookQuery.getSex())){
					list.add(cb.equal(root.get("sex").as(String.class),bookQuery.getSex()));
				}
				Predicate[] p = new Predicate[list.size()];
		        return cb.and(list.toArray(p));
			}
		}, new PageRequest(pageno-1, pagesize,Sort.Direction.ASC,"id"));
	}

	@Override
	public void updateStudent(Student stu) {
		
	}

	@Transactional
	@Override
	public void del(int id) {
		dao.delete(id);
	}
	
}
