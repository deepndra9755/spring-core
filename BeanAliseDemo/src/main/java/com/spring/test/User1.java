package com.spring.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.spring.customer.DefaultDem;

public class User1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 DefaultListableBeanFactory dbs=null;
		 XmlBeanDefinitio!nReader xbdr=null;
		dbs=new DefaultListableBeanFactory();
		xbdr=new XmlBeanDefinitionReader(dbs);
		xbdr.loadBeanDefinitions("com/spring/CGF/applicationContext.xml");
       DefaultDem hol=dbs.getBean("com.spring.customer.DefaultDem",DefaultDem.class);
       System.out.println(hol);
       DefaultDem holl=dbs.getBean("koppp",DefaultDem.class);
       System.out.println(holl);
       
		 
	}

}
