package com.test.enums;

public enum DataSourceType {
	
	TEST1("test1"),
	
	TEST2("test2");
	
	private String name;
	
	

	private DataSourceType(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
