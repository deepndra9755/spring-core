package com.online.platform;

import java.util.Random;

import com.online.couriour.PostService;

public class FlipcartOn implements Platform {
 
	 PostService poc;

	public FlipcartOn(PostService pojj) {
		
		this.poc = pojj;
	}



	@Override
	public String shoping(float[] f) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
	    
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
