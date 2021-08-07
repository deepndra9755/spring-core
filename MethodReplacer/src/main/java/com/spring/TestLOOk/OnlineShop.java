package com.spring.TestLOOk;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

public class OnlineShop{                         //here we can take interface also with default modifire
public OnlineShop()
{
	System.out.println("this is constructor of OnlineShop");	
}
public void process(int j,int k)
{
int persentage=j*k/100;
System.out.println("this is value of j this is method of OnlineShop "+persentage );
}
}
