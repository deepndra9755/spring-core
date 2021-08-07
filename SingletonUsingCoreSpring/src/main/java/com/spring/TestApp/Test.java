package com.spring.TestApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.spring.Singleton.SingletonDemo;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext cts=null;
		cts=new FileSystemXmlApplicationContext("src/main/java/com/spring/cfg/applicationContext.xml");
		SingletonDemo kop=cts.getBean("h1pp",SingletonDemo.class);
		kop.show("first","singhchouhan h1pp"+kop.hashCode());
		SingletonDemo kow=cts.getBean("h1pp",SingletonDemo.class);
		kop.show("second with same bean id h1pp","singhchouhan"+kop.hashCode());
		SingletonDemo kopp=cts.getBean("h1pp",SingletonDemo.class);
		kopp.show("third time ","haonn id h1pp"+kopp.hashCode());
		
		SingletonDemo k=cts.getBean("hp",SingletonDemo.class);
         k.show("fourth using another id hp","kala"+k.hashCode());
	}

}
