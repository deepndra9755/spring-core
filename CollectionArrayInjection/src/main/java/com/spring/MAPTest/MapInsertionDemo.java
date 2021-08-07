package com.spring.MAPTest;

import java.util.Date;
import java.util.Map;

public class MapInsertionDemo {
	Map<String,Date> stud;

	public MapInsertionDemo(Map<String, Date> stud) {
		this.stud = stud;
	}

	@Override
	public String toString() {
		return "MapInsertionDemo [stud=" + stud + "]";
	}
	
	

}
