package com.spring.TestLOOk;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("gg")
public class Process {
	@Autowired
    @Qualifier("dd")
	private Date d;
	
	public void GetSys()
	{
		 int dy=d.getMonth();
       if(dy<10)
       {
    	   System.out.println("this is month first week");
       }
       else if(dy>10||dy<20)
       {
    	   System.out.println("this is month middle week");
       }
       else
       {
    	  
        	   System.out.println("end is month first week");
          
        
       }
       
       
	
	}
	

}
