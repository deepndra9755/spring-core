package com.spring.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.spring.BO.BOIMPL;
import com.spring.DAO.DataAccessTEAM;
import com.spring.DTO.DTOcls;
@Component("ser")
public class CalculatorAppIMPL implements Calculator {
    
  @Autowired
  @Qualifier("ds")
	DataAccessTEAM dd;
	@Override
	public String cal(DTOcls dos) throws Exception {
		// TODO Auto-generated method stub
	     BOIMPL bb=null;
	     
	     bb=new BOIMPL();
		
		int travle=Integer.parseInt(dos.getTreavel());
		dos.getPost();
		int tax=Integer.parseInt(dos.getGovtTax());
		dos.getLast();
		float sall=Integer.parseInt(dos.getSallary());
        float comes=sall*travle/100;
        float comes1=sall*tax/100;
        sall=comes+comes;
        bb.setName(dos.getName());
        bb.setLast(dos.getLast());
        bb.setPost(dos.getPost());
        bb.setSallary(sall);
        
         int j= dd.insert(bb);
         System.out.println("this is output of qry "+j);
         if(j==0)
         {
        	System.out.println("not inserted"); 
         }
         else
        	 System.out.println("inserted");
		return null;
	}

}
