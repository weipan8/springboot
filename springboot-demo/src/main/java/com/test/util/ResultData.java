package com.test.util;

import com.alibaba.fastjson.JSON;

public class ResultData {
	
	public static final String SUCCESS="success";
	public static final String FAILED="failed";
	
	public String status="";
	public String descript="";
	public Object data="";
	
	@Override
	public String toString() {
		return JSON.toJSONString(this);
	}
	
	

}
