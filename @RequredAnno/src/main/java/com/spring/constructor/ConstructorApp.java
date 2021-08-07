package com.spring.constructor;

import java.util.Date;

public class ConstructorApp {
	int id;
	String name;
	String last;
	float sall;
	Date dat;
	Date doj;
	public ConstructorApp(int id, String name, String last, float sall, Date dat, Date doj) {
		super();
		this.id = id;
		this.name = name;
		this.last = last;
		this.sall = sall;
		this.dat = dat;
		this.doj = doj;
	}
	@Override
	public String toString() {
		return "ConstructorApp [id=" + id + ", name=" + name + ", last=" + last + ", sall=" + sall + ", dat=" + dat
				+ ", doj=" + doj + "]";
	}
	
	
	
	
	

}
