package com.spring.dao;
import java.sql.SQLException;
import java.util.List;

import com.spring.bo.*;
public interface DAO {
	public List<BoImp> insert(String id,String city,String department) throws SQLException;

}
