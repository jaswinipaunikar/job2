/*package com.manipal.service.impl;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.manipal.DAO.jdbc.JdbcCustomerDao;
import com.manipal.model.Address;
import com.manipal.model.Customer;
import com.manipal.service.CustomerService;

public class Test implements CustomerService {
	
	
	JdbcCustomerDao cust=new JdbcCustomerDao();
	@Override
	public List<Customer> retrieveCustomerDatas()
			throws ClassNotFoundException, SQLException, IOException {
		// TODO Auto-generated method stub
		return null;
	}
	public int saves(Customer customer, Address add2)
			throws ClassNotFoundException, SQLException, IOException {
		int add=cust.save(customer,add2);
		return add;
	}
	public static void main(String[] args) {
		Customer customer=new Customer();
		Test t=new Test();
		t.saves(Customer customer, Address add2);

	}

}
*/