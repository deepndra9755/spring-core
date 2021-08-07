package com.spring.Client;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.spring.CarIM.CarDemo;

public class Customer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DefaultListableBeanFactory hg=null;
		XmlBeanDefinitionReader sd=null;
		hg=new DefaultListableBeanFactory();
		sd=new XmlBeanDefinitionReader(hg);
		sd.loadBeanDefinitions("com/spring/CFG/appliicationContext.xml");
		
		CarDemo hop=hg.getBean("opi",CarDemo.class);
		System.out.println(hop);
//		CarDemo raja=hg.getBean("yup",CarDemo.class);
//		System.out.println(raja);

	}

}
