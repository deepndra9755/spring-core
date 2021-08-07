package com.spring;



import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.spring.VO.VoIMPL;
import com.spring.controler.Controll;

@SpringBootApplication
public class RealTimeDiCalculateSallaryUsingBootApplication {

	public static void main(String[] args) {
		Scanner sc=null;
		String name,last,post,sallary,govtTax,Treavel;
		sc=new Scanner(System.in);
		 VoIMPL op=new VoIMPL();
	       System.out.println("enter your name");
	      op.setName(sc.next());
	       System.out.println("enter your last");
	       op.setLast(sc.next());   
	       System.out.println("enter your post");
	       op.setPost(sc.next());
	       System.out.println("enter your sallary");
	       op.setSallary(sc.next());
	       System.out.println("enter your govtTax");
	        op.setGovtTax(sc.next());
	       System.out.println("enter your travle");
	       op.setTreavel(sc.next());
	    ApplicationContext cts=null;
	    
		cts=SpringApplication.run(RealTimeDiCalculateSallaryUsingBootApplication.class, args);
		Controll ctt= cts.getBean("ntr",Controll.class);
	  try {
			ctt.calculate(op);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("not inserted babe");
			e.printStackTrace();
		}
	       
	       
	     
	}

}
