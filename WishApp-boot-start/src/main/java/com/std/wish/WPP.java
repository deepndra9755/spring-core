package com.std.wish;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("gett")
public class WPP {
		@Autowired
		Date datt;
		public void getDatt()
		{
			 int mont=datt.getDate();
			 if(mont<10)
			 {
				 System.out.println("this is first week of mointh  & today date isc"+mont);
			 }
			 else if(mont>10||20>mont)
			 {
				 System.out.println("this is middle week of mointh  & today date isc"+mont);

			 }
			 else if(mont>20)
			 {
				 System.out.println("this is end week of mointh  & today date isc"+mont);

			 }
			 
	      
	    }


}
