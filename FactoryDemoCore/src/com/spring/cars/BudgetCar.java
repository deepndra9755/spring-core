package com.spring.cars;

import com.spring.Try.AppoloTyre;
import com.spring.Try.Tyre;

public class BudgetCar implements CarType {
    Tyre hop;
	public BudgetCar()
	{
		new AppoloTyre();
	}
	@Override
	public String typeV() {
		// TODO Auto-generated method stub
		return hop.TyreType();
	}

}
