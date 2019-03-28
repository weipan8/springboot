package com.test.config;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.test.enums.DataSourceType;

@Retention(RetentionPolicy.RUNTIME)    
@Target(ElementType.METHOD)  
public @interface MyDataSource {

	 DataSourceType value() default DataSourceType.TEST1;
}


