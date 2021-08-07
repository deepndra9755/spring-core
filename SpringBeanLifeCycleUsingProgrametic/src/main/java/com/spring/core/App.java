package com.spring.core;

import java.util.Date;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component("dtop")
public class App implements InitializingBean,DisposableBean   {
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
	//@PostConstruct
	public void initp()
	{
	
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
    
	public void destroyy()
	{
   

	}
	@Override
	 @PreDestroy
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		  System.out.println("destroy exicute");
			d=null;
			name=null;	
	}
	@Override
	@PostConstruct
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
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
	
	

}
