package com.manipal.DAO.jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.manipal.model.Customer;

public class trialCustView 
{
	public List<Customer> view(Customer cc) throws ClassNotFoundException,
			SQLException, IOException {
		List<Customer>list=new ArrayList<Customer>();
		String sql="select customer.customer_ID,customer.customer_first_name,customer.customer_first_name,"
				+ "address.city from CUSTOMER join address"
				+ " on customer.address_id=address.address_id";

		Connection con=ConnectionHelper.getMySqlConnection();
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(sql);
		Customer cust;
		while(rs.next())
		{
			cust=new Customer();
			String customerId = rs.getString(1);
			System.out.println("id:"+customerId);
			String customerFirstName = rs.getString(4);
			String customerLastName = rs.getString(5);
			String customerGender = rs.getString(6);
			String customerDOB = rs.getString(7);
			String customerContact = rs.getString(8);
			String customerEmail = rs.getString(9);
			
			String customerRegisterDate = rs.getString(11);
			String customerStatus = rs.getString(12);
			
			Customer c = new Customer(customerId,customerFirstName,customerLastName,
					customerGender,customerDOB,customerContact,customerEmail,
					customerRegisterDate,customerStatus);
			System.out.println("...."+c.getCustomer_Id());
			list.add(c);
			
		}
		return list;
	}
	
}
