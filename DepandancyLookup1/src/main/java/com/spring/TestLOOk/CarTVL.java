package com.spring.TestLOOk;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

public class CarTVL {
	String id;
	public CarTVL()
	{
		System.out.println("this is target constructor");
	}
	
	public CarTVL(String id) {
		this.id = id;
	}
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
		DefaultListableBeanFactory db=null;
		XmlBeanDefinitionReader xsdd=null;
		db=new DefaultListableBeanFactory();
		xsdd=new XmlBeanDefinitionReader(db);
		xsdd.loadBeanDefinitions("com/spring/cfg/applicationContext.xml");
		Engine jo=db.getBean(id,Engine.class);

		return jo.Startt();
	}

}
