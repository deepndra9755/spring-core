package com.spring.Client;

import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.App.ReminderTest;

public class Testuser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx=null;
		ctx=new ClassPathXmlApplicationContext("com/spring/cfg/applicationContext.xml");
		ReminderTest k=ctx.getBean("gtop",ReminderTest.class);
		k.setdepp();
		System.out.println();
		

	}

}
