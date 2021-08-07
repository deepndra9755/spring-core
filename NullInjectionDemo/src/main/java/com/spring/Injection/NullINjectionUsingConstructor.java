package com.spring.Injection;

import java.util.Date;

public class NullINjectionUsingConstructor {
     int num;
	String name;
	String last;
	Date d;
	Date d1;
	Date d2;
	Date d3;
	String na;
	int jop;
	public NullINjectionUsingConstructor(int num, String name, String last, Date d, Date d1, Date d2, Date d3,
			String na, int jop) {
		super();
		this.num = num;
		this.name = name;
		this.last = last;
		this.d = d;
		this.d1 = d1;
		this.d2 = d2;
		this.d3 = d3;
		this.na = na;
		this.jop = jop;
	}
	@Override
	public String toString() {
		return "NullINjectionUsingConstructor [num=" + num + ", name=" + name + ", last=" + last + ", d=" + d + ", d1="
				+ d1 + ", d2=" + d2 + ", d3=" + d3 + ", na=" + na + ", jop=" + jop + "]";
	}
	
	
	

}
