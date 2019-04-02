package com.test.app;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;


/*@SpringBootApplication(scanBasePackages="com.test",exclude={
        DataSourceAutoConfiguration.class
})*/
/*@EnableTransactionManagement*/
@ComponentScan(basePackages = "com.test")
@EnableAutoConfiguration(exclude = {
       /*DataSourceAutoConfiguration.class*/
})
@MapperScan(basePackages = "com.test.mapper")

public class SpringBootMain {
	
	public static void main(String[] args) {
		//ss
		SpringApplication.run(SpringBootMain.class, args);
	}

}
