package com.online.couriour;

public class DHL implements PostService {

	public DHL()
	{
		System.out.println("this is 0 param constructor of DHL");	
	}
	@Override
	public String delivery() {
		// TODO Auto-generated method stub
		return " welcome to DHL post service ";
	}

}
