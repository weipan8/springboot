package com.test.entity;

import java.io.Serializable;

public class Dept implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public int deptId=0;
	public String deptName="";
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	
	
	

}
