package com.spr.Test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.spr.target.WishApp;

public class TestApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
         
         
            Resource res=null;
            BeanFactory bs=null;
            res=new FileSystemResource("src/com/spr/cfg/applicationContext.xml");
            bs=new XmlBeanFactory(res);
           
            Object obj=bs.getBean("wsg");
            WishApp opp=(WishApp)obj;
            String result=opp.WishGenrator("deependra");
            System.out.println(result);
                       
	}

}
