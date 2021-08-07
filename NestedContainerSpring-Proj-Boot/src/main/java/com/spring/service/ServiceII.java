package com.spring.service;

import com.spring.dto.DTOimpl;

import java.sql.SQLException;
import java.util.List;

public interface ServiceII {
	
public List<DTOimpl>finding(String id,String city,String depaartment)throws SQLException;
}
