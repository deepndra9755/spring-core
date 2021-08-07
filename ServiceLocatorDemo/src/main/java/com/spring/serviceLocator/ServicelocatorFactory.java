package com.spring.serviceLocator;

import org.springframework.beans.factory.FactoryBean;

import com.spring.ExternalComp.IIP;

public class ServicelocatorFactory implements FactoryBean<IIP> {
      public static final IIP opip=new IIP();
      public ServicelocatorFactory()
      {
    	  
    	System.out.println("construtor of factory method");  
      }
	@Override
	public IIP getObject() throws Exception {
		
		// TODO Auto-generated method stub
		return opip;
	}

	@Override
	public Class<?> getObjectType() {
		// TODO Auto-generated method stub
		return IIP.class;
	}
	

}
