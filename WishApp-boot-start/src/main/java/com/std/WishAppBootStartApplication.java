package com.std;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.std.wish.WPP;

@SpringBootApplication
public class WishAppBootStartApplication {

	public static void main(String[] args) {
		ApplicationContext ctxxx=null;
		
		ctxxx=SpringApplication.run(WishAppBootStartApplication.class, args);
		WPP wp=ctxxx.getBean("gett",WPP.class);
		wp.getDatt();
		
	}

}
