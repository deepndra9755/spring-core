package com.spring.TestLOOk;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarTVL {
	String id;
	
	
	
public CarTVL(String id) {

		this.id = id;
		System.out.println("construcor of target  param");
	}
//	public CarTVL(String id) {
//		this.id = id;
//		System.out.println("construcor of target  param");
//	}
	public void Entertaitment()
	{
	System.out.println("listning music");	
	}
	public void Horn()
	{
	System.out.println(" pressing hourn");	
	}
	public void fuiel()
	{
		System.out.println("filling fuill");
	}
	
	public String journey()
	{
		ApplicationContext db=null;
		db=new ClassPathXmlApplicationContext("com/spring/cfg/applicationContext.xml");
		
		Engine jo=db.getBean(id,Engine.class);

		return jo.Startt();
	}

}
