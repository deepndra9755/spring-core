package com.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.spring.test.TestApp;

@SpringBootApplication
public class SpringConfigurationPropSApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(SpringConfigurationPropSApplication.class, args);
		TestApp dem=ctx.getBean("cmp",TestApp.class);
		System.out.println(dem);
	}

}
