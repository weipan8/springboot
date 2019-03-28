package com.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.test.context.junit4.SpringRunner;

import com.alibaba.fastjson.JSON;
import com.redis.SpringbootApplication;
import com.test.mapper.EmpMapper;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringbootApplication.class)
public class RedisTest {
	
	@Autowired
	private RedisTemplate<String, String> redisTemplate;
	
	@Test
	public void test(){
		//System.out.println(JSON.toJSONString(redisTemplate,true));
		ValueOperations<String, String> opsForValue = redisTemplate.opsForValue();
		opsForValue.set("name", "springbootRedis");
	}

	@Autowired
	private EmpMapper empMapper;
	@Test
	public void test1(){
		System.out.println(JSON.toJSONString(empMapper.findEmps(),true));
	}
}
