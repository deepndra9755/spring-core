package com.spring.App;

import java.util.Date;

public class ReminderTest {
	Date d;

	public ReminderTest(Date d) {
		this.d = d;
	}
	public void setdepp()
	{
	   int month=d.getMonth();
	   int year=d.getYear();
	   if(month>5||year>2000)
	   {
		System.out.println("you are in middle of year and currnty mothh  "+month+"   and currenty year  "+year);   
	   }
	   else if(month<5||year>2000)
	   {
			System.out.println("you are in first stage  of year statrting and currnty mothh  "+month+"   and currenty year  "+year);   

	   }
	}
	
}
