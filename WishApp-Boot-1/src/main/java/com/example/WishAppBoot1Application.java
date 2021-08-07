package com.example;

import java.util.Date;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.wise.app.WishGenerotor;

@SpringBootApplication
public class WishAppBoot1Application {
	@Bean("mg")
	public Date getd()
	{ 
	return new Date();	
	}
	public static void main(String[] args) {
		
		ApplicationContext ctxx=null;
		ctxx=SpringApplication.run(WishAppBoot1Application.class, args);
		WishGenerotor flip=ctxx.getBean("msg",WishGenerotor.class);
		flip.getUp();
		
	}

}
