package com.online.platform;

import java.util.Date;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.online.couriour.PostService;

public class FlipcartOn implements Platform {
 
//	 @Autowired
//	 @Qualifier("bdd")
	 PostService poc;
	 Date dd;
	 
	 @Autowired(required =true)
public FlipcartOn( @Qualifier("bdd")PostService poc, Date dd) {
		
		this.poc = poc;
		this.dd = dd;
		System.out.println("this is two param construct ");
	}

	 @Autowired(required =false)
public FlipcartOn( @Qualifier("sys")Date dd) {
	
	this.dd = dd;
}


//	 @Autowired
//	 @Qualifier("d2")
	 
//	 @Autowired
//	 @Qualifier("")
//	public void my(PostService poc) {
//		this.poc = poc;
//		System.out.println("this is my method   "+poc.getClass());
//	}
//	@Autowired
//	public FlipcartOn(@Qualifier("dj")PostService poc) {
//		System.out.println("this is 1 param constructor ");
//		this.poc = poc;
//	}
//	@Autowired 
//	@Qualifier("d1")
//	public void setPoc(PostService poc) {
//		this.poc = poc;
//		System.out.println("this is my method   "+poc.getClass());
//	}



//	PUBLIC FLIPCARTON() 
//	{
//		SYSTEM.OUT.PRINTLN("FLIPCART CONSTRUCTOR");
//		
//	}

	
	public String shoping(float[] f) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
	    System.out.println("shoping method ");
	    Random rm=new Random();
	    int id=rm.nextInt();
	    float count=0;
	    System.out.println(dd);
	   for(float h:f)
	   {
		count=h+count;   
	   }
	   
	    return "this is your bill "+count +" and this is delivery type "+poc.delivery()+" this is your id "+id+"";
		
	}

}
