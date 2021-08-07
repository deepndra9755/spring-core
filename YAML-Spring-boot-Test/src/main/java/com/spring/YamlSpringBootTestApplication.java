package com.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.main.PropertyInitilizer;

@SpringBootApplication
public class YamlSpringBootTestApplication {

	public static void main(String[] args) {
		ApplicationContext cts=SpringApplication.run(YamlSpringBootTestApplication.class, args);
	
		PropertyInitilizer pop=cts.getBean("scl",PropertyInitilizer.class);
	   pop.prr();
	}

}
