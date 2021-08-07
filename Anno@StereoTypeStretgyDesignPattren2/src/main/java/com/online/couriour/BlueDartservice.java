package com.online.couriour;

import org.springframework.stereotype.Component;
@Component("bddd")
public class BlueDartservice implements PostService {
   
	 public BlueDartservice()
	 {
		 System.out.println("this is 0 param constructor of Bluedart couriour");
	 }
	@Override
	public String delivery() {
		// TODO Auto-generated method stub
		return " welcome to BlueDart post service ";
	}

}
