package com.wise.app;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Component("msg")
public class WishGenerotor {
	@Autowired
	Date d;
	public void getUp()
	{
       System.out.println(d);
	}

}
