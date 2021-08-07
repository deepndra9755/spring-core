package com.spring.Client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.App.SetterPTest;
import com.spring.constructor.ConstructorApp;

public class Customer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext cts=null;
		cts=new ClassPathXmlApplicationContext("com/spring/cfg/applicationContext.xml");
		SetterPTest j=cts.getBean("gope",SetterPTest.class);
		System.out.println(j);
	}

}
