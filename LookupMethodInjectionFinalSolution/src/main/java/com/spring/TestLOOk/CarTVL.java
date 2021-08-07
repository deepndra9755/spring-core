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
@Component("juy")
@Lazy
public interface  CarTVL{                         //here we can take interface also with default modifire
//	Engine eg;
//	ApplicationContext cts;
//static int countt=0;	
//public CarTVL()
//{
//	System.out.println("this is target construcor");
//countt++;
//}
//public void setEg(Engine eg) {
//	this.eg = eg;
@Lookup("kop")
public abstract Engine getdd();
//}
public default  void process(String k)
{
	Engine jopp=getdd();
	jopp.process(k);
	//System.out.println("this is object of target");
//	eg.process(k);
	System.out.println("this is object of target     with data"+k);


//@Override
//public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
//	// TODO Auto-generated method stub
//	cts=applicationContext;
//	
//	
//}

}
}
