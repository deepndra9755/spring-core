package com.spring.client;

import java.util.Scanner;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.VO.VoIMPL;
import com.spring.VO.VoINTER;
import com.spring.controler.Controll;

public class Customer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=null;
		String name,last,post,sallary,govtTax,Treavel;
		sc=new Scanner(System.in);
		ApplicationContext db=null;
//		DefaultListableBeanFactory db=null;
//		XmlBeanDefinitionReader xsd=null;
//		db=new DefaultListableBeanFactory();
//		xsd=new XmlBeanDefinitionReader(db);
		//db=new ClassPathXmlApplicationContext("");
		new ClassPathXmlApplicationContext("com/spring/CFG/applicationContext.xml");
      //  xsd.loadBeanDefinitions("com/spring/CFG/applicationContext.xml");
        VoIMPL op=new VoIMPL();
       System.out.println("enter your name");
      op.setName(sc.next());
       System.out.println("enter your last");
       op.setLast(sc.next());   
       System.out.println("enter your post");
       op.setPost(sc.next());
       System.out.println("enter your sallary");
       op.setSallary(sc.next());
       System.out.println("enter your govtTax");
        op.setGovtTax(sc.next());
       System.out.println("enter your travle");
       op.setTreavel(sc.next());
       
       
       Controll fop=db.getBean("cont",Controll.class);
       try {
		fop.calculate(op);
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		System.out.println("not inserted babe");
		e.printStackTrace();
	}
       
       
       
       
      
      
      
     
	}

}
