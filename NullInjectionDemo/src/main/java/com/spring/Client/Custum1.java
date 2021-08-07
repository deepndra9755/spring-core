package com.spring.Client;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.spring.Injection.NullINjectionUsingConstructor;

public class Custum1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DefaultListableBeanFactory dd=null;
		XmlBeanDefinitionReader ddr;
		dd=new DefaultListableBeanFactory();
		ddr=new XmlBeanDefinitionReader(dd);
		ddr.loadBeanDefinitions("com/spring/CGF/applicationContext.xml");
       
		NullINjectionUsingConstructor hjoō=dd.getBean("hope",NullINjectionUsingConstructor.class);
	    System.out.println(hjoō);
	}

}
