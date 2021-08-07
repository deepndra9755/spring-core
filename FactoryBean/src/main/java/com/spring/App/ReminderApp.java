package com.spring.App;

import java.util.Date;

import org.springframework.beans.factory.FactoryBean;



public class ReminderApp implements FactoryBean<Date> {
	
	int month;
	int year;
	//Date d;
	
	public ReminderApp(int month, int year) {
		
		this.month = month;
		this.year = year;
		
	}

	@Override
	public Date getObject() throws Exception {
		// TODO Auto-generated method stub
		 Date fo=new Date();
		 fo.setMonth(month);
		 fo.setYear(year);
		 
		 return fo;
	}

	@Override
	public Class<?> getObjectType() {
		// TODO Auto-generated method stub
		return java.util.Date.class;
	}
}
