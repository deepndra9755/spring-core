package com.spring.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.spring.customer.CriketBat;

public class User1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 DefaultListableBeanFactory dbs=null;
		 XmlBeanDefinitionReader xbdr=null;
		dbs=new DefaultListableBeanFactory();
		xbdr=new XmlBeanDefinitionReader(dbs);
		xbdr.loadBeanDefinitions("com/spring/CGF/applicationContext.xml");
        CriketBat kol=dbs.getBean("holl",CriketBat.class);
        
        System.out.println(kol.perform());
        
       
		 
	}

}
