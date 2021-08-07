package com.spring.serviceLocator;

import org.springframework.beans.factory.FactoryBean;

import com.spring.ExternalComp.IIP;

public class ServicelocatorFactory
{
	static  IIP iip=new IIP();
	public ServicelocatorFactory()
	{
	
	}
	public final static  IIP getins()
	{
		return iip;
	}
}
