package com.spring.Client;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.spring.TestLOOk.CarTVL;
import com.spring.TestLOOk.Engine;

public class User1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DefaultListableBeanFactory db=null;
		XmlBeanDefinitionReader xsdd=null;
		db=new DefaultListableBeanFactory();
		xsdd=new XmlBeanDefinitionReader(db);
		xsdd.loadBeanDefinitions("com/spring/cfg/applicationContext.xml");
		CarTVL joo=db.getBean("juy",CarTVL.class);
        System.out.println(joo.journey());
        joo.Entertaitment();
        joo.fuiel();
        joo.Horn();
        
		

	}

}
