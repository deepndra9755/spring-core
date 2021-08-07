package com.spring.Client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.TestLOOk.Process;
import com.spring.cfg.ConfigureAPP;

public class User1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext db=null;
		db=new AnnotationConfigApplicationContext(ConfigureAPP.class);	
		
		Process dop=db.getBean("gg",com.spring.TestLOOk.Process.class);
		
			dop.GetSys();
		
		

	}

}
