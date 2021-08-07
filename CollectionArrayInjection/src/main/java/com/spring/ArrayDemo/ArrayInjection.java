package com.spring.ArrayDemo;

import java.util.Date;
import java.util.Arrays;

public class ArrayInjection {
	int marks[];
	Date dop[];

	public void setMarks(int[] marks) {
		this.marks = marks;
	}


	public void setDop(Date[] dop) {
		this.dop = dop;
	}


	@Override
	public String toString() {
		return "ArrayInjection [marks=" + Arrays.toString(marks) + ", dop=" + Arrays.toString(dop) + "]";
	}
	
	

}
