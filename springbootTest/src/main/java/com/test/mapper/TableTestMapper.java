package com.test.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;



public interface TableTestMapper {
	
	
	@Insert("INSERT INTO `ta_test1`(test1_name) VALUE(#{name})")
	void addtest1(@Param("name") String name);
	
	@Insert("INSERT INTO `ta_test2`(test1_name) VALUE(#{name})")
	void addtest2(@Param("name") String name);

}
