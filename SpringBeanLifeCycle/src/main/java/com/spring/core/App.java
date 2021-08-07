package com.spring.core;

import java.util.Date;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component("dtop")
public class App {
	@Value("19")
	int age;
	@Value("dipendra")
	String name;
	Date d;
	
	public void setAge(int age) {
		this.age = age;
	}
	public void setName(String name) {
		this.name = name;
	}
//	public void setGen(String gen) {
//		this.gen = gen;
//	}
	@PostConstruct
	public void initp()
	{
		 System.out.println("init -method exe");
		d=new Date();
		
		 if(name==null)
		{
			 name="usser";
		System.out.println("name not inserted");
		return ;
		}
		 else if(age<0)
		 {
			 age=age*-1;
			 System.out.println("age not inserted");
				return  ; 
		 }
	}
	public void check()
	{
		  if(age>18)
		  {
			  
		    System.out.println("you are eligible "+name+" age of yours"+age);	  
		  }
		  else
		  {
			  
			  System.out.println("you are not eligible"+ name +" age of yours"+age+"   "+d);
		  }
		
	}
     @PreDestroy
	public void destroyy()
	{
     System.out.println("destroy exicute");
	d=null;
	name=null;

	}
	
	

}
