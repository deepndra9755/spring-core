package com.wise.app;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("dep")
public class WishGenerotor {
	@Autowired
	Date d;
	public void getUp()
	{
       System.out.println(d);
	}

}
