package com.spring.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.spring.target.WPP;

public class Mymain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Resource rs=null;
		
		rs=new FileSystemResource("src/com/spring/cfg/applicationContext.xml");
		BeanFactory fex=new XmlBeanFactory(rs);
		
		WPP wp=(WPP)fex.getBean("tg");
		wp.WppGen();
		

	}

}
