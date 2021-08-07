package com.objectCreation.test;

public class TestApp123 {
	static {
	   System.out.println("test class loaded ");
	}
	public TestApp123()
	{
		System.out.println("constructor of test object creation");
	}
	public TestApp123(int s)
	{
		System.out.println(" 1 param constructor of test object creation");
	}
	public TestApp123(int j,int k)
	{
		System.out.println("2 param constructor of test object creation");
	}
	@Override
	public String toString() {
		return "TestApp printed";
	}
	

}
