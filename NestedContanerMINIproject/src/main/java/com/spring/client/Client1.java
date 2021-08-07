package com.spring.client;

import java.sql.SQLException;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.controller.ControllerIMPL;
import com.spring.vo.VOimple;

public class Client1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac=null,cc=null;
		//VOimple pp=null;
		ac=new ClassPathXmlApplicationContext("com/spring/cfg/Parent.xml");
		String jy[]= {"com/spring/cfg/child.xml"};
		cc=new ClassPathXmlApplicationContext(jy,ac);
		ControllerIMPL gy=cc.getBean("kop",ControllerIMPL.class);
		try {
			List<VOimple> j=gy.find("1","khargone","SR");
			//System.out.println(j);
			if(j.isEmpty())
			{
				System.out.println("record not found");
			}
			for(VOimple pp:j)
			{
				
				//System.out.println(pp.getId());
				System.out.print(pp.getNAME());
				System.out.print(pp.getSALLARY());
				//System.out.print(pp.getJOB());
				System.out.print(pp.getCITY());
				System.out.print(pp.getDEPARTMENT());
				System.out.println("");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
