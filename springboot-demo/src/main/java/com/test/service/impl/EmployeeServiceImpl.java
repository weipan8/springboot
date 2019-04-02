package com.test.service.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.hibernate.SQLQuery;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.dao.StudentDao;
import com.test.model.Employee;
import com.test.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	@Autowired
	protected EntityManager em;
	
	/*@Autowired
    protected EmployeeDao employeeDao;
	*/
	public List<Employee> getEmps() {
		
		Query nativeQuery = em.createNativeQuery("select e.id,e.name,e.age,e.birthday,e.sex from employee e");
		//指定返回对象类型
		nativeQuery.unwrap(SQLQuery.class).setResultTransformer(Transformers.aliasToBean(Employee.class));
		//返回对象
		List<Employee> resultList = nativeQuery.getResultList();   
		return resultList;
	}
	

}
