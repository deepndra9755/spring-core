package com.spring.target;

import java.util.Date;

public class WPP {
	
Date dts;


public void setDts(Date dts) {
	this.dts = dts;
}


public void WppGen()
{
if(dts.getDate()>10)
{
	System.out.println("you are in middle of month and date is "+dts.getDate());
}
else
{
System.out.println("WPP.WppGen()  and date is "+dts.getDate());	
}
		
}


}
