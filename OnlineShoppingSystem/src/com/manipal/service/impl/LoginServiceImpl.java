package com.manipal.service.impl;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.manipal.DAO.jdbc.JdbcLoginDAOImpl;
import com.manipal.model.Customer;
import com.manipal.service.*;

public class LoginServiceImpl implements LoginService {
	JdbcLoginDAOImpl jdbcLoginDAOImpl = new JdbcLoginDAOImpl();
	@Override
	public int checkLogin() {
		// TODO Auto-generated method stub
		return 0;
	}

	
	public List<Customer> validates() throws 
	ClassNotFoundException, SQLException, IOException
	{
		
		List<Customer> list=new ArrayList<Customer>();
		list=jdbcLoginDAOImpl.validate();
		return list;
	}
	
}