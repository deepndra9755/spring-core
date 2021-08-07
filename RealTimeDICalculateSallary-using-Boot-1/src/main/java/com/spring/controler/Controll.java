package com.spring.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.spring.DTO.DTOcls;
import com.spring.Service.Calculator;
import com.spring.VO.VoIMPL;

@Component("ntr")
public class Controll implements Monitoring {
    @Autowired
    @Qualifier("serr")
	Calculator cs;
       
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
