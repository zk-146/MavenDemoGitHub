package com.lti.entity;

public class Calculator {
	public int add(int x, int y) {
		int result = x + y;
		return result;
	}

	public void searchEmpId(int empid)
	{
		if(empid==0)
		{
			throw new ArithmeticException("u enetered zero");
		}
		else
		{
			System.out.println(" do something");
		}
		
	}
}
