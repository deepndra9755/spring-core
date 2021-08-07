package com.spring.test;

import com.spring.cars.BudgetCar;
import com.spring.cars.CarType;
import com.spring.cars.LookingCar;
import com.spring.cars.SportsCar;

public class TestAPPP {

public static CarType getInsta(String j)
{
if(j.equalsIgnoreCase("sports"))
{
	System.out.println("sport s fac");
return new SportsCar();
}
else if(j.equalsIgnoreCase("budget"))
{
	return new LookingCar();
}
else if(j.equalsIgnoreCase("looking"))
{
	return new BudgetCar();
}

return null;


}

}
