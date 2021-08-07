package com.spring.testApp;

import java.util.Calendar;
import java.util.Date;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.spring.DemoApp.FactoryMethod;

public class ClientApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DefaultListableBeanFactory cts=null;
		XmlBeanDefinitionReader rd=null;
		cts=new DefaultListableBeanFactory();
		rd=new XmlBeanDefinitionReader(cts);
		rd.loadBeanDefinitions("com/spring/cfg/applicationContext.xml");
       

				String cal=cts.getBean("jo",String.class);
                System.out.println(cal);
		
		//		Calendar cal=cts.getBean("dtd",Calendar.class);
//		System.out.println(cal.getTime());
//		//cts=new FileSystemXmlApplicationContext("src/com/spring/cfg/applicationContext.xml");
//		Date t=(Date)cts.getBean("gt");
//         //t.show();
//		System.out.println(t);
//        try {
//			Date d=(Date)t.newInstance();
//		   System.out.println(d.getTime());
//		} catch (InstantiationException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IllegalAccessException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}

}
