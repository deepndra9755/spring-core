package com.spring.Client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.core.App;

public class Customer{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ApplicationContext ac=null;
      ac=new ClassPathXmlApplicationContext("com/spring/cfg/applicationContext.xml");
      App obj=ac.getBean("gopi",App.class);
     obj.check();
      ((ClassPathXmlApplicationContext) ac).close();
      
	}

}
