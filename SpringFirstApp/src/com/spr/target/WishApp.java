package com.spr.target;

import java.util.Date;

public class WishApp {
	private Date date=null;

	public void setDate(Date date) {
		this.date = date;
	}
	public String WishGenrator(String user)
	{
		int hour=0;
		hour=date.getHours();
		if(hour>12)
		{
		return "good afternoon"+user+"";
		}
		else if(hour<12)
		{
		return "good morning"+user+"";
		}
		else
		{
			return "good night "+user+"";	
		}
	}
	
			
	

}
