package com.test.config;

import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.test.enums.DataSourceType;

@Configuration
public class DataSorceConfig {
	
	@Bean(name = "test1")
    @ConfigurationProperties(prefix = "spring.datasource.test1") // application.properteis中对应属性的前缀
    public DataSource dataSource1() {
        return DataSourceBuilder.create().build();
    }


    @Bean(name = "test2")
    @ConfigurationProperties(prefix = "spring.datasource.test2") // application.properteis中对应属性的前缀
    public DataSource dataSource2() {
        return DataSourceBuilder.create().build();
    }
    
    @Bean(name="dynamicDataSource")
    @Primary
    public DataSource dataSource() {  
        DynamicDataSource dynamicDataSource = new DynamicDataSource();  
        DataSource test1 = dataSource1();  
        DataSource test2 = dataSource2();  
        //设置默认数据源  
        dynamicDataSource.setDefaultTargetDataSource(test1);     
        //配置多数据源  
        Map<Object,Object> map = new HashMap<Object,Object>();  
        map.put(DataSourceType.TEST1.getName(), test1);   //key需要跟ThreadLocal中的值对应  
        map.put(DataSourceType.TEST2.getName(), test2);  
        dynamicDataSource.setTargetDataSources(map);              
        return dynamicDataSource;  
    }  
}
