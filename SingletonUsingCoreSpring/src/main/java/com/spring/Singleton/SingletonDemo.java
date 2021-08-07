package com.spring.Singleton;

public class SingletonDemo {
	private static SingletonDemo obj;
	private SingletonDemo()
	{
		
	}
	
	public static SingletonDemo Getinstan()
	{
		if(obj==null)
		{
		obj=new SingletonDemo();
		return obj;
		}
		else
		{
		return obj;
	}
		}
public void show(String j,String k)
{
	System.out.println("this is name of user"+j+"  this is last name of user"+k);
}

}
