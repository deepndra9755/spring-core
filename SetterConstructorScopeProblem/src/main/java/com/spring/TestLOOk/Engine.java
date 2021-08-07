package com.spring.TestLOOk;

public class Engine {
	static int count=0;
	public Engine()
	{
		System.out.println("this is dependent constrctotrr");
	count++;	
	}
   
	public void process(String j)
	{
		System.out.println("this is object of dependent  "+count+"    with date"+j);
	}
}
