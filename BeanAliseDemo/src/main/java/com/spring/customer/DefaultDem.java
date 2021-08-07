package com.spring.customer;

import java.util.Date;
import java.util.List;

import javax.xml.crypto.Data;

public class DefaultDem {
	Date dobs;
	List<String> name;
	public DefaultDem(Date dobs, List<String> name) {
		
		this.dobs = dobs;
		this.name = name;
	}
	@Override
	public String toString() {
		return "DefaultDem [dobs=" + dobs + ", name=" + name + "]";
	}
	
	

}
