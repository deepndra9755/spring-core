package com.spring.customer;

import java.util.Random;

public class Bat {
	
	public String score(String name)
	{
	Random rm=new Random();
	
	return name+"  is scored "+rm.nextInt(200);
	}
	

}
