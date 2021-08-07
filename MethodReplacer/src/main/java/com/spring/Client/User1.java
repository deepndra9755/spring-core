package com.spring.Client;


import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.TestLOOk.OnlineShop;



public class User1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext db=null;
		db=new ClassPathXmlApplicationContext("com/spring/cfg/applicationContext.xml");
		OnlineShop dop=db.getBean("juy",OnlineShop.class);
			dop.process(2000,3);
			
		
		

	}

}
