package com.spring.ArrayDemo;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.spring.MAPTest.MapInsertionDemo;
import com.spring.SetDemo.SetInsertionDemo;
import com.spring.property.PropertyDEMO;

public class ClientApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DefaultListableBeanFactory dbs=null;
		XmlBeanDefinitionReader xss=null;
		dbs=new DefaultListableBeanFactory();
		xss=new XmlBeanDefinitionReader(dbs);
		xss.loadBeanDefinitions("com/spring/CFG/applicationContext.xml");
		//ArrayInjection ko=dbs.getBean("cg",ArrayInjection.class);
		//DateInsertion dopp=(DateInsertion)dbs.getBean("dtt",DateInsertion.class);
		//ListInsertionDemo fol=(ListInsertionDemo)dbs.getBean("lst",ListInsertionDemo.class);
		//System.out.println(fol);
          // SetInsertionDemo sopi=(SetInsertionDemo)dbs.getBean("gui",SetInsertionDemo.class);
	        //System.out.println(sopi);
		
		 //MapInsertionDemo sopi=(MapInsertionDemo)dbs.getBean("gp",MapInsertionDemo.class);
        //System.out.println(sopi);
		 PropertyDEMO sopi=(PropertyDEMO)dbs.getBean("por",PropertyDEMO.class);
        System.out.println(sopi);
		
	}

}
