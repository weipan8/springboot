package com.test;

import org.junit.Test;

public class StudentServiceTest{
	
	@Test
	public void test1(){
		
		String [] arr=new String[5];
		arr[0]="爱仕达ad";
		arr[1]="爱仕达ad";
		arr[2]="爱仕达ad";
		arr[3]="爱仕达ad";
		arr[4]="爱仕达ad";
		Object obj=arr;
		String [] arr2=(String[]) obj;
		System.out.println(obj);
	
	}

}
