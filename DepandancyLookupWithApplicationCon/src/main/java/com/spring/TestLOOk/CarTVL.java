package com.spring.TestLOOk;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;

public class CarTVL {
	String id;
	
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
	
	public String journey(String n,ApplicationContext cts)
	{	
		Engine jo=cts.getBean(id,Engine.class);

		return jo.Startt();
	}

}
