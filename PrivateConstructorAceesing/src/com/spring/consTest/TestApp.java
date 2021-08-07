package com.spring.consTest;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

public class TestApp {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class h=Class.forName(args[0]);
			Constructor jh[]=h.getDeclaredConstructors();
			jh[0].setAccessible(true);
			ConstructorApp g=(ConstructorApp)jh[0].newInstance(12,10);
			
			System.out.println(g.j);
			System.out.println(g.y);
			
		} 
		catch (Exception e) {
			// TODO: handle exception
		}
	}

}
