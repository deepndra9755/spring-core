package com.spring.test;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


@ConfigurationProperties(prefix ="stud")
@Component("cmp")
public class TestApp {
	int roll;
	String name;
	@Override
	public String toString() {
		return "TestApp [roll=" + roll + ", name=" + name + "]";
	}
	

}
