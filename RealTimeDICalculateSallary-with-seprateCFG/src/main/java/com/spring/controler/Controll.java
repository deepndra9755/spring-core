package com.spring.controler;

import org.springframework.beans.factory.annotation.Autowired;

import com.spring.DTO.DTOcls;
import com.spring.Service.Calculator;
import com.spring.VO.VoIMPL;

public class Controll implements Monitoring {
       Calculator cs;
       
	
	public Controll(Calculator cs) {
		super();
		this.cs = cs;
	}


	public void calculate(VoIMPL op) throws Exception {
		// TODO Auto-generated method stub
       DTOcls dto=new DTOcls();
       dto.setName(op.getName());
       dto.setLast(op.getLast());
       dto.setPost(op.getPost());
       dto.setSallary(op.getSallary());
       dto.setGovtTax(op.getGovtTax());
       dto.setTreavel(op.getTreavel());
        
        cs.cal(dto);
	}

}
