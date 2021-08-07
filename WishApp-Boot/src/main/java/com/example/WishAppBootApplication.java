package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.wise.app.WishGenerotor;

@SpringBootApplication
public class WishAppBootApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		
	  ctx=SpringApplication.run(WishAppBootApplication.class, args);
	  
	  WishGenerotor j=ctx.getBean("dep",WishGenerotor.class);
	  j.getUp();
	  
	
		
	}

}
