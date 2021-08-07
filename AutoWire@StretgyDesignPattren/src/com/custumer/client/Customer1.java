package com.custumer.client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.online.platform.FlipcartOn;

public class Customer1 {

	public static void main(String[] args) {
 		// TODO Auto-generated method stub

       BeanFactory bro=null;
       Resource res=null;
       res=new ClassPathResource("com/spr/cfg/applicationContext.xml");
       bro=new XmlBeanFactory(res);
       FlipcartOn op=bro.getBean("flct",FlipcartOn.class);
       float f[]= {34,555,333,22};
       System.out.println(op.shoping(f));
        
	}

}
