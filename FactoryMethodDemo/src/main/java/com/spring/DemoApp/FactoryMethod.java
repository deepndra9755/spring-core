package com.spring.DemoApp;

import java.util.Date;

public class FactoryMethod {
	
	public static final Object getOBJ(String j) throws ClassNotFoundException
	{
		java.util.Date obj=null;
	    Class c=Class.forName("j");
	 try {
		  obj=(java.util.Date) c.newInstance();
	} catch (InstantiationException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IllegalAccessException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 return obj;
	}
	
	public String show()
	{
	 return "hwllo user";
	}

}
