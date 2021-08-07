package com.spring.ExternalComp;

public class IIP {
	
	public IIP()
	{
		
		System.out.println("construcor of IIP");
	}
	public String score(int ide)
	{
		if(ide==1010)
		{
			return "CSK WON THE MATCH BY 5 WICKET MI SCORE 158 AND CSK SCORE 159";

		}
		else if(ide==1011)
		{
			return "DC WON THE MATCH BY 8 WICKET KKR SCORE 158 AND DC SCORE 200";
		}
		else if(ide==1012) 
		{
			
			return "RCB WON THE MATCH BY 9 WICKET XXIK SCORE 200 AND DC SCORE 201";
	
		}
		return "not match";
	}
	

}
