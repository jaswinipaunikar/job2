package com.manipal.DAO.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.manipal.DAO.DeleteProductDAO;

public class JdbcDeleteProductImpl implements DeleteProductDAO{


	@Override
	public boolean deleteProduct(String Product_Id) {
		int row=0;
		try{
			
		System.out.println("here jdbc impl");
		Connection con=ConnectionHelper.getMySqlConnection();
		PreparedStatement pst=null;
		pst=con.prepareStatement("update Product set product_status='inactive' where product_id=?");
		System.out.println("after update");
		pst.setString(1,Product_Id);
		System.out.println("set string");
		row=pst.executeUpdate();
	
		
	
		con.commit();
		con.close();
		pst=null;	
	
		
		
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		if(row>=1)
			return true;
			else
			return false;
}
		

	}

		
		