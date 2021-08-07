package com.online.platform;

import java.util.Random;

//import javax.inject.Inject;
//import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.online.couriour.PostService;

public class FlipcartOn implements Platform {
     
	  @Autowired
	 PostService poc;
	  
	public FlipcartOn() {
	
		System.out.println("this is flipcart constructor");
	}

	@Override
	public String shoping(float[] f) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
	    System.out.println("this is shoping method "+poc.getClass());
	    Random rm=new Random();
	    int id=rm.nextInt();
	    float count=0;
	   for(float h:f)
	   {
		count=h+count;   
	   }
	   
	    return "this is your bill "+count +" and this is delivery type "+poc.delivery()+" this is your id "+id+"";
		
	}

}
