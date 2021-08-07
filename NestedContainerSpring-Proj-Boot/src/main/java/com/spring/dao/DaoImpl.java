package com.spring.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.spring.bo.BoImp;
@Component("dao")
public class DaoImpl implements DAO {
		public static final String QRY_TO_SEARCH="SELECT NAME,ADDRESS,CITY, SALLARY,JOB,DEPARTMENT FROM CIVIL WHERE CITY=? AND DEPARTMENT=?";
        @Autowired
		DataSource dl;
  
    List<BoImp> lst=new ArrayList<BoImp>();

	@Override
	public List<BoImp> insert(String id,String city,String department) throws SQLException {
		// TODO Auto-generated method stub
		Connection con=null;
		 BoImp po=null;
		PreparedStatement pl=null;
		ResultSet rs=null;
		try
		{
		con=dl.getConnection();
		 pl=con.prepareStatement(QRY_TO_SEARCH);
		// pl.setInt(1,Integer.parseInt(id));
		 pl.setString(1,city);
		 pl.setString(2,department);
		 rs=pl.executeQuery();
		while(rs.next())
		{
       po=new BoImp();			
		//po.setId(rs.getString(1));
		po.setNAME(rs.getString(1));
		po.setADDRESS(rs.getString(2));
		po.setCITY(rs.getString(3));
		po.setSALLARY(rs.getString(4));
		po.setDEPARTMENT(rs.getString(5));
	    lst.add(po);
		}
		return lst;
		}
		catch(SQLException ee)
		{
		ee.printStackTrace();
		throw ee;
		}
		catch(Exception ee)
		{
		ee.printStackTrace();
		throw ee;
		}
		finally {
			try {
				rs.close();
			} catch (Exception e) {
				// TODO: handle exception
			}
			try {
				pl.close();
			} catch (Exception e) {
				// TODO: handle exception
			}
			try {
				con.close();
			} catch (Exception e) {
				// TODO: handle exception
			}
			
		}
		
	}

}
