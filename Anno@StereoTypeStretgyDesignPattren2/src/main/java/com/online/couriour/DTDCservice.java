package com.online.couriour;

import org.springframework.stereotype.Component;

@Component("dtdc")
public class DTDCservice implements PostService {

	public DTDCservice()
	{
	System.out.println("DTDC 0  param constructor");	
	}
	@Override
	public String delivery() {
		// TODO Auto-generated method stub
		return " welcome to DTDC post service ";
	}

}
