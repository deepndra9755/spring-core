package com.spring.TestLOOk;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;
import org.springframework.stereotype.Component;

@Component("kop")
public class ReplaceShopp implements MethodReplacer{

	  public ReplaceShopp() {
		// TODO Auto-generated constructor stub
	System.out.println("this is cons of replaceShop()");
	 }
	@Override
	public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
	 	int j=(int)args[0];
		int k=(int)args[1];

      int persentage=j*k/100;
       System.out.println("this is value of j and this is replacement method"+persentage );
return persentage;
		
	}
	
}
