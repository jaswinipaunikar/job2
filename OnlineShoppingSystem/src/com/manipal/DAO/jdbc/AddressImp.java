package com.manipal.DAO.jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.manipal.DAO.AddressDao;
import com.manipal.model.Address;
import com.manipal.model.Customer;

public class AddressImp implements AddressDao
{

	@Override
	public int insertAddress(Address a) throws ClassNotFoundException,
			SQLException, IOException 
	{
		Connection con = null;
		PreparedStatement stmt = null;
		int insAddress=0;
		String sql = "insert into address values(address_seq.NEXTVAL,?,?,?,?,?)";
		con = ConnectionHelper.getMySqlConnection();
		System.out.println("connected?");
		PreparedStatement pst =  con.prepareStatement(sql);
		

		pst.setString(1, a.getAddress());	
		pst.setString(2, a.getCity());
		pst.setString(3, a.getState());
		pst.setString(4, a.getCountry());
		pst.setString(5, a.getZipcode());
		insAddress=pst.executeUpdate();
		return insAddress;
	
	}

	@Override
	public Address getAddressData(String ids) throws ClassNotFoundException,
			SQLException, IOException {
		Address c=new Address();
		String idss=ids;
		String sql="select * from Address where Address_id='idss'";
		Connection con=ConnectionHelper.getMySqlConnection();
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(sql);
		Address cust;
		while(rs.next())
		{
			cust=new Address();
			String addressId = rs.getString(1);
			System.out.println("id:"+addressId);
			String address=rs.getString(2);
			String city = rs.getString(3);
			String state = rs.getString(4);
			String country = rs.getString(5);
			String zipcode = rs.getString(6);
			c = new Address(addressId,address,city,state,
					country,zipcode);
			System.out.println("id::::"+c.getAddress_Id());
		
			
		}
		return c;
	
		
		 }

}
