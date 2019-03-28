package com.test.config;

import javax.sql.DataSource;

import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

//@Configuration
public class DataSorceConfig {
	
	@Bean(name = "test1")
	@Primary
    @ConfigurationProperties(prefix = "spring.datasource.test1") // application.properteis中对应属性的前缀
    public DataSource dataSource1() {
        return DataSourceBuilder.create().build();
    }


    @Bean(name = "test2")
    @ConfigurationProperties(prefix = "spring.datasource.test2") // application.properteis中对应属性的前缀
    public DataSource dataSource2() {
        return DataSourceBuilder.create().build();
    }
    
}
