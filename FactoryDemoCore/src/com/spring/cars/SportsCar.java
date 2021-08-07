package com.spring.cars;

import com.spring.Try.MRF;
import com.spring.Try.Tyre;

public class SportsCar implements CarType {
      Tyre gop;
      
	public SportsCar() {
		System.out.println("construct");
		gop=new MRF();
	}

	@Override
	public String typeV() {
		// TODO Auto-generated method stub
		return gop.TyreType();
	}
	

}
