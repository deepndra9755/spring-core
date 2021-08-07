package com.spring.client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.spring.classes.ConstructorInjection;

public class Customer1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource res=null;
		BeanFactory bo=null;
		res=new ClassPathResource("com/spring/cfg/applicationContext.xml");
        bo=new XmlBeanFactory(res); 
        ConstructorInjection con=bo.getBean("df",ConstructorInjection.class);
        con.show();
	}

}
