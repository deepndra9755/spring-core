package com.test.ClientApp;

import java.util.Scanner;

import com.spring.cars.BudgetCar;
import com.spring.cars.CarType;
import com.spring.cars.LookingCar;
import com.spring.cars.SportsCar;
import com.spring.test.TestAPPP;

public class ClientAPP {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner sc=null;
		sc=new Scanner(System.in);
		System.out.println("choice car");
		
		System.out.println("sports car");
		System.out.println("budget car");
		System.out.println("Looking car");
		String nam=sc.next();
		
		CarType c1=TestAPPP.getInsta(nam);
		if(c1 instanceof SportsCar)
		{
		    SportsCar sd=(SportsCar)c1;
		    System.out.println(sd.typeV());
		}
		else if(c1 instanceof BudgetCar)
		{
			BudgetCar sd=(BudgetCar)c1;
		    System.out.println(sd.typeV());
		}
		else if(c1 instanceof LookingCar)
		{
			LookingCar sd=(LookingCar)c1;
		    System.out.println(sd.typeV());
		}
		
		     
		     
		     
		
	}

}
