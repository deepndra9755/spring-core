package com.spring.TestLOOk;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarTVL implements ApplicationContextAware{
	Engine eg;
	ApplicationContext cts;
static int countt=0;	
public CarTVL()
{
	System.out.println("this is target construcor");
countt++;
}
public void setEg(Engine eg) {
	this.eg = eg;
}
public void process(String k)
{
	Engine jopp=cts.getBean("kop",Engine.class);
	jopp.process(k);
	//System.out.println("this is object of target");
//	eg.process(k);
	System.out.println("this is object of target  "+countt+"    with data"+k);

}
@Override
public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
	// TODO Auto-generated method stub
	cts=applicationContext;
	
	
}


}
