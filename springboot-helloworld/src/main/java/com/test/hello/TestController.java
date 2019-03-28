package com.test.hello;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@EnableAutoConfiguration
@RestController
public class TestController {
	
	
	@GetMapping("/hello")
	public Map<String, String> hello(){
		
		Map<String, String> map=new HashMap<String, String>();
		map.put("name", "springboot");
		map.put("id", "asdasd");
		return map;
	}
	
	public static void main(String[] args) {
		
		SpringApplication.run(TestController.class, args);
	}

}
