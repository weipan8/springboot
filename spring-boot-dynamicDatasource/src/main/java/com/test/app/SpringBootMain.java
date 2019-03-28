package com.test.app;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;


/*@SpringBootApplication(scanBasePackages="com.test",exclude={
        DataSourceAutoConfiguration.class
})*/
@ComponentScan(basePackages = "com.test")
@EnableAutoConfiguration(exclude = {
        DataSourceAutoConfiguration.class
})
@EnableTransactionManagement(order = 2) //设置事务执行顺序(需要在切换数据源之后，否则只走默认库)
@MapperScan(basePackages = "com.test.testmapper")
public class SpringBootMain {
	
	public static void main(String[] args) {
		
		SpringApplication.run(SpringBootMain.class, args);
	}

}
