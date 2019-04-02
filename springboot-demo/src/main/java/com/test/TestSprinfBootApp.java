package com.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@EnableAutoConfiguration
@SpringBootApplication
public class TestSprinfBootApp {
	
	
	public static void main(String[] args) {
		/*SpringApplication.run(HelloController.class, args);*/
		//System.out.println("启动springboot..");
		SpringApplication.run(TestSprinfBootApp.class, args);
	}
	

}
