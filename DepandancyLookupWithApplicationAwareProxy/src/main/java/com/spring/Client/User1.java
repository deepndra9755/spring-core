package com.spring.Client;

import org.omg.CORBA.portable.ApplicationException;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.TestLOOk.CarTVL;
import com.spring.TestLOOk.Engine;

public class User1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext db=null;
		db=new ClassPathXmlApplicationContext("com/spring/cfg/applicationContext.xml");
		
		CarTVL joo=db.getBean("juy",CarTVL.class);
		;
		System.out.println(joo.journey());
        //System.out.println(((CarTVL) );
        joo.Entertaitment();
        joo.Horn();
        
		

	}

}
