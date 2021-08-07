package com.spring.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.spring.bo.BoImp;
import com.spring.dao.DAO;
import com.spring.dto.DTOimpl;

public class ServiceImpl implements ServiceII {
	DAO dop;
	List<BoImp>d;
	List<DTOimpl> po=new ArrayList<DTOimpl>();
	
	BoImp jopp=new BoImp();
	
	public ServiceImpl(DAO dop) {
		this.dop = dop;
		System.out.println("this is from service iomple");
	}
	@Override
	public List<DTOimpl> finding(String id,String city,String depaartment) throws SQLException {
		// TODO Auto-generated method stub
		DTOimpl doi=null;
		 d=dop.insert(id,city,depaartment);
		 int k=d.size();
		
		  for(BoImp jopp :d)
		    {
			 doi=new DTOimpl();
//			 jopp=(BoImp)d.get(j);
			 
		//	doi.setId(jopp.getId());
			doi.setCITY(jopp.getCITY());
			 doi.setADDRESS(jopp.getADDRESS());
			 doi.setDEPARTMENT(jopp.getDEPARTMENT());
			 doi.setSALLARY(jopp.getSALLARY());
			 doi.setNAME(jopp.getNAME());
			 po.add(doi);
			 
		 }
		 return po;
		
	}

}
