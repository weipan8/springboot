/*package com.test.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

import com.test.model.Employee;




public interface EmployeeDao extends Repository<Employee, Integer>{

	@Query(value="select new com.test.service.EmployeeService(e.id,e.name,e.age,e.birthday,e.sex) from employee e")
	public List<Employee> getEmps();
	
	@Query(value="select * from employee e")
	public List<Object> getemps();

}
*/