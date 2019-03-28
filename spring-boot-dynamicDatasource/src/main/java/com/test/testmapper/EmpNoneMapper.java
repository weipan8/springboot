package com.test.testmapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;

import com.test.entity.Emp;



public interface EmpNoneMapper {
	
	List<Emp> findEmps();
	
	@Insert("insert into emps(empName,salary,birthday,telephone,dept_id_fk)"
			+ " values(#{emp.empName},#{emp.salary},#{emp.birthday},#{emp.telephone},#{emp.dept.deptId})")
	@Options(useGeneratedKeys = true, keyProperty = "emp.empId")
	void addEmp(@Param("emp")Emp emp);

}
