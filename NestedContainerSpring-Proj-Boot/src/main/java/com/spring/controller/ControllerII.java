package com.spring.controller;
import com.spring.vo.VOimple;
import java.sql.SQLException;
import java.util.List;

public interface ControllerII {
	public List<VOimple> find(String id,String city,String depaartment)throws SQLException;

}
