package com.objectCreation.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class NewInstanceDemo {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class c=null;
			c=Class.forName(args[0]);
			Constructor con[]=c.getDeclaredConstructors();
			Object obj=con[0].newInstance(1);
			TestApp123 ho=(TestApp123)obj;
			System.out.println(ho);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
