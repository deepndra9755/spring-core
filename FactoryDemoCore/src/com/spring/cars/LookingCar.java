package com.spring.cars;

import com.spring.Try.CeatTyre;
import com.spring.Try.Tyre;

public class LookingCar implements CarType {
     Tyre hio;
     
	public LookingCar() {
		hio=new CeatTyre();	
	}

	@Override
	public String typeV() {
		// TODO Auto-generated method stub
		return hio.TyreType();
	}

}
