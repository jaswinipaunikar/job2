package com.manipal.DAO.jdbc;


import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

import com.manipal.DAO.SupplierDAO;
import com.manipal.model.Address;
//import com.manipal.model.Orders;
import com.manipal.model.Supplier;

public class SupplierDAOImp  implements SupplierDAO
{


	

	@Override
	public List<Supplier> retrieveSupplierData() throws ClassNotFoundException,
			SQLException, IOException {
		String sql = "select * from SUPPLIER";
		Connection con = ConnectionHelper.getMySqlConnection();
		Statement st =  con.createStatement();
		ResultSet rs = st.executeQuery(sql);
		List<Supplier> list = new ArrayList<Supplier>();
		while(rs.next()){
			String supplier_Id = rs.getString(1);
			String supplier_Name = rs.getString(2);
			String supplier_Username = rs.getString(3);
			String supplier_Password = rs.getString(4);
			String supplier_Contact = rs.getString(5);
			String supplier_Email = rs.getString(6);
			String contact = rs.getString(7);
			
			Supplier r= new Supplier(supplier_Id, supplier_Name, supplier_Username, supplier_Password,
						 supplier_Contact, supplier_Email);
				list.add(r);
				
		}
		
		return list;
	}

	

	
	@Override
	public List<Supplier> viewData() throws ClassNotFoundException,SQLException, IOException {
		String sql = "Select * from Supplier";
		//String sql = "Select * from Supplier where statusd='active'";
		Connection con = ConnectionHelper.getMySqlConnection(); 
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(sql);
		List<Supplier> list = new ArrayList<Supplier>();
		while(rs.next()){
			String supplier_Id = rs.getString(1);
			String supplier_Name = rs.getString(2);
			String supplier_Username = rs.getString(3);
			String supplier_Password = rs.getString(4);
			String supplier_Contact = rs.getString(5);
			String supplier_Email = rs.getString(6);
			String supplier_Address_Id =rs.getString(7);
		//	String suuplier_status=rs.getString(8);
		
			Supplier r= new Supplier(supplier_Id, supplier_Name, supplier_Username, supplier_Password,
					 supplier_Contact, supplier_Email, supplier_Address_Id);
			list.add(r);
			
			
	}
		return list;
	}
	
	@Override
	public List<Address> viewData1() throws ClassNotFoundException,SQLException, IOException {
		String sql = "Select * from Address,Supplier where Address.Address_Id=Supplier.Address_Id";
		Connection con = ConnectionHelper.getMySqlConnection(); 
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(sql);
		List<Address> list = new ArrayList<Address>();
		while(rs.next()){
			String address_Id=rs.getString(1);

			String address = rs.getString(2);
			String address_City = rs.getString(3);
			String address_State = rs.getString(4);
			String address_Country = rs.getString(5);
			String address_Zipcode = rs.getString(6);
			
			Address addr =new Address(address_Id,address,address_City,address_State,address_Country,address_Zipcode);
			
			list.add(addr);
	}
		return list;
	}

	
	@Override
	public int updateData(Supplier c,Address a) throws ClassNotFoundException,
			SQLException, IOException {

		String sql1 = "update address set address=?, City=?, State=?, Country=?, Zipcode=? where address_Id=(Select address_Id from supplier where supplier_Id=?)";
		String sql = "update supplier set supplier_Name=?, supplier_Username=?, supplier_Password=?, supplier_Contact=?, supplier_Email=? where supplier_Id=? ";
		Connection con = ConnectionHelper.getMySqlConnection();
		System.out.println("connected?");
		PreparedStatement pst =  con.prepareStatement(sql);

		PreparedStatement pst1 =  con.prepareStatement(sql1);
		
		
		pst.setString(1, c.getSupplier_Name());
		System.out.println("are you here");
		pst.setString(2, c.getSupplier_Username());
		pst.setString(3, c.getSupplier_Password());
		pst.setString(4, c.getSupplier_Contact());
		pst.setString(5, c.getSupplier_Email());
		pst.setString(6, c.getSupplier_Id());
		
		System.out.println("are you still here");
		
		pst1.setString(1, a.getAddress());
		pst1.setString(2, a.getCity());	
		pst1.setString(3, a.getState());
		pst1.setString(4, a.getCountry());
		pst1.setString(5, a.getZipcode());
		
		pst1.setString(6, c.getSupplier_Id());
		
	System.out.println("come sweety come");
		
		int b= pst1.executeUpdate();
		
		int i= pst.executeUpdate();
		System.out.println("executed");

		
		return i;
	}
	
	@Override
	public int deleteData(String supplier_Id) throws ClassNotFoundException,
			SQLException, IOException {
		int i=0;
		PreparedStatement ps=null;
		String str = "update Supplier set status='inactive' where Supplier_Id="+supplier_Id;
		Connection con = ConnectionHelper.getMySqlConnection();
			ps=con.prepareStatement(str);
			i= ps.executeUpdate();
			if(i!=0){
				System.out.println("Data Deleted");
			}
			else{
				System.out.println("Data not Deleted");
			}
		return i;
	}
	/*
	@Override
	public List<Orders> insertorder() throws ClassNotFoundException,
			SQLException, IOException {
		String sql = "select * from Orders";
		Connection con = ConnectionHelper.getMySqlConnection();
		Statement st =  con.createStatement();
		ResultSet rs = st.executeQuery(sql);
		List<Orders> list = new ArrayList<Orders>();
		while(rs.next()){
			 String order_Id =rs.getString(1);
			 String order_Placed_Date = rs.getString(2);
			 String order_Total_Price = rs.getString(3);
			 String customer_Id = rs.getString(4);
			 String cart_Id = rs.getString(5);
			
			
			Orders order =new Orders( order_Id, order_Placed_Date,
					 order_Total_Price,  customer_Id,  cart_Id);
				list.add(order);
				
		}
		
		return list;
	}

	*/





public int insertData(Supplier c, Address a) throws ClassNotFoundException, SQLException, IOException{
		System.out.println("insert into supplier");
	
		String sql = "insert into address(address,city,state,country,zipcode) values(?,?,?,?,?)";
		System.out.println("AFTER QUERY");
		Connection con = ConnectionHelper.getMySqlConnection();
		System.out.println("connected?");
		PreparedStatement pst1=  con.prepareStatement(sql);
		System.out.println("pst1");
		
		pst1.setString(1, a.getAddress());
		pst1.setString(2, a.getCity());	
		pst1.setString(3, a.getState());
		pst1.setString(4, a.getCountry());
		pst1.setString(5, a.getZipcode());
		
		
		int b= pst1.executeUpdate();
		System.out.println("SUPPLIER'S address added");

		String sql1 = "insert into supplier(SUPPLIER_NAME,SUPPLIER_USERNAME,SUPPLIER_PASSWORD,SUPPLIER_CONTACT,ADDRESS_ID,SUPPLIER_STATUS) "
				+ "values(?,?,?,?,?,?)";
		PreparedStatement pst =  con.prepareStatement(sql1);
		pst.setString(1, c.getSupplier_Name());
		pst.setString(2, c.getSupplier_Username());
		pst.setString(3, c.getSupplier_Password());
		pst.setString(4, c.getSupplier_Contact());
		//pst.setString(5, c.getSupplier_Email());
		pst.setInt(5, Statement.RETURN_GENERATED_KEYS);
		pst.setString(6, "active");
		System.out.println("are you still here");
		
		
		
		
		int i= pst.executeUpdate();
		System.out.println("supplier added");

		
		return i;
		
	}

	
}
