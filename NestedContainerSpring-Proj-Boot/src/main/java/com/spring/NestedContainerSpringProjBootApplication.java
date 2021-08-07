package com.spring;

import java.sql.SQLException;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.spring.controller.ControllerIMPL;
import com.spring.vo.VOimple;

@SpringBootApplication
public class NestedContainerSpringProjBootApplication {
    
	public static void main(String[] args) {
		ApplicationContext cts=SpringApplication.run(NestedContainerSpringProjBootApplication.class, args);
	    
		ControllerIMPL gy=cts.getBean("kop",ControllerIMPL.class);
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
