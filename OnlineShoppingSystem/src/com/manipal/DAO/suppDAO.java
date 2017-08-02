package com.manipal.DAO;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.manipal.DAO.jdbc.ConnectionHelper;
import com.manipal.model.Address;
//import com.manipal.model.Orders;
import com.manipal.model.Supplier;



public class suppDAO
{
public int insertData(Supplier c, Address a) throws ClassNotFoundException, SQLException, IOException{
		System.out.println("im from DAO");
		
		
		String sql = "insert into supplier values(supplier_seq.NEXTVAL,?,?,?,?,supp_address_seq.CURRVAL,?)";

		String sql1 = "insert into address values(supp_address_seq.NEXTVAL,?,?,?,?,?,?)";
		System.out.println("AFTER QUERY");
		Connection con = ConnectionHelper.getMySqlConnection();
		System.out.println("connected?");
		PreparedStatement pst =  con.prepareStatement(sql);
		System.out.println("pst1");
		PreparedStatement pst1 =  con.prepareStatement(sql1);
		pst1.setString(1, a.getAddress());
		pst1.setString(2, a.getCity());	
		pst1.setString(3, a.getState());
		pst1.setString(4, a.getCountry());
		pst1.setString(5, a.getZipcode());
		pst1.setString(6, a.getStatus());
		
		int b= pst1.executeUpdate();
		System.out.println("address added");
		
		pst.setString(1, c.getSupplier_Name());
		System.out.println("are you here");
		pst.setString(2, c.getSupplier_Username());
		pst.setString(3, c.getSupplier_Password());
		pst.setString(4, c.getSupplier_Contact());
		pst.setString(5, c.getSupplier_Email());
		System.out.println("are you still here");
		
		
		
		
		int i= pst.executeUpdate();
		System.out.println("executed");

		
		return i;
		
	}
/*

public int insertorder(Orders o) throws ClassNotFoundException, SQLException, IOException{
	System.out.println("im from DAO");
	
	
	String sql = "insert into orders values(orders_seq.NEXTVAL,?,?,?,?)";

	
	System.out.println("AFTER QUERY");
	Connection con = ConnectionHelper.getMySqlConnection();
	System.out.println("connected?");
	PreparedStatement pst =  con.prepareStatement(sql);
	
	pst.setString(1, o.getOrder_Placed_Date());
	System.out.println("are you here");
	pst.setString(2, o.getOrder_Total_Price());
	pst.setString(3, o.getCustomer_Id());
	pst.setString(4, o.getCart_Id());
	
	System.out.println("are you still here");
	
	
	
	
	int i= pst.executeUpdate();
	System.out.println("executed");

	
	return i;
	
}
*/}
