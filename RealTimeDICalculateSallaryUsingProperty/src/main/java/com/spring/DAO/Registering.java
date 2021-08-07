package com.spring.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import com.spring.BO.BOIMPL;

public final class Registering implements DataAccessTEAM {

	private DataSource ds;
	
     public Registering(DataSource ds) {
		
		this.ds = ds;
	}

	public static final String QRY_TO_INSERT="INSERT INTO SALLAC(NAME,LAST,SALL,POST) VALUES(?,?,?,?)";
	

	@Override
	public int insert(BOIMPL boo) throws Exception {
		// TODO Auto-generated method stub
		Connection con=ds.getConnection();
		PreparedStatement ps=con.prepareStatement(QRY_TO_INSERT);
		ps.setString(1,boo.getName());
		ps.setString(2,boo.getLast());
		ps.setFloat(3,boo.getSallary());
		ps.setString(4,boo.getPost());
	     int count=ps.executeUpdate();
		return count;
	}

}
