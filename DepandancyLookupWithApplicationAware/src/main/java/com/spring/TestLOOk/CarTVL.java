package com.spring.TestLOOk;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarTVL implements ApplicationContextAware{
	//String id;
	ApplicationContext cts;
	
	
	public CarTVL() {
		System.out.println("this is target constructor");
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
		Engine jo=cts.getBean("kop",Engine.class);
		return jo.Startt();
	}
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		// TODO Auto-generated method stub
		 cts=applicationContext;
		
	}

}
