package com.spring.controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import com.spring.bo.BoImp;
import com.spring.dto.DTOimpl;
import com.spring.service.ServiceII;
import com.spring.vo.VOimple;
@Component("kop")
public class ControllerIMPL implements ControllerII
{
      @Autowired
      @Qualifier("service")
      @Lazy(true)
	ServiceII cj;
	
	List<DTOimpl> hol1;
	DTOimpl jopp=new DTOimpl();

	private List<VOimple> hol=new ArrayList<VOimple>();

	@Override
	public List<VOimple> find(String id, String city, String depaartment) throws SQLException {
		// TODO Auto-generated method stub
		VOimple doi=null;
		//hol = null;
	     hol1=cj.finding(id, city, depaartment);
	     //	int l= hol1.size();
	     for(DTOimpl jopp:hol1)
		 {
			 doi=new VOimple();
			 
			//jopp=(DTOimpl)hol1.get(p);
			// doi.setId(jopp.getId());
			 doi.setCITY(jopp.getCITY());
			 doi.setADDRESS(jopp.getADDRESS());
			 doi.setDEPARTMENT(jopp.getDEPARTMENT());
			 doi.setSALLARY(jopp.getSALLARY());
			 doi.setNAME(jopp.getNAME());
			// System.out.println();
			 hol.add(doi);
			 
		 }
		return hol;
	}

}
