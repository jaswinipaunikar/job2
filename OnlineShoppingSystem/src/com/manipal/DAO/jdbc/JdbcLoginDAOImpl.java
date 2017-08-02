package com.manipal.DAO.jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.manipal.DAO.LoginDAO;
import com.manipal.model.Customer;

public class JdbcLoginDAOImpl implements LoginDAO {
	@Override
	public String check() {
		
		return null;
	}

	public List<Customer> validate() throws ClassNotFoundException,
			SQLException, IOException {

		String sql="SELECT * FROM CUSTOMER";
		Connection con=ConnectionHelper.getMySqlConnection();

		Statement st =  con.createStatement();
		System.out.println("con created");
		ResultSet rs = st.executeQuery(sql);
		System.out.println("after rs");
		List<Customer> list = new ArrayList();
		
		System.out.println("sql executed");
		while(rs.next()){
			
			String userName = rs.getString(2);
			String password = rs.getString(3);
			
			Customer customerLogin = new Customer(userName,password);
			list.add(customerLogin);
		}
		
		return list;
		
	}


}
