package com.spring.service;

import com.spring.ExternalComp.IIP;

public class ServiceImpl {
	IIP jop;
	
	public ServiceImpl(IIP jop) {
	
		this.jop = jop;
		System.out.println("service impl construcor exe");
	}

	public String score(int j)
	{
	     return jop.score(j); 	
	}

}
