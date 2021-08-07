package com.spring.main;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix="scl.comd")
@Component("scl")
//@ConfigurationProperties(prefix = )
public class PropertyInitilizer {
	//@Value("${scl.tenth.roll}")
	int roll;
	String name;
	public void prr()
	{
		System.out.println("roll"+roll+"  name"+name);
	}

	



	
	
	
}
