package com.manipal.service.impl;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;




import com.manipal.DAO.CustomerDAO;
import com.manipal.DAO.jdbc.ConnectionHelper;
import com.manipal.DAO.jdbc.JdbcCustomerDao;
import com.manipal.model.Address;
import com.manipal.model.Customer;
import com.manipal.service.CustomerService;

public class CustomerServiceImp implements CustomerService{
	JdbcCustomerDao cust=new JdbcCustomerDao();
	//Customer co=new Customer();
	List<Customer> list=new ArrayList<Customer>();
	List<Address> list1=new ArrayList<Address>();
	int add;
	
	
	@Override
	public List<Customer> retrieveCustomerDatas()
			throws ClassNotFoundException, SQLException, IOException {
		list=cust.retrieveCustomerData();
		for (Customer customer : list) {
			System.out.println(customer.getCustomer_Id());
		}
		//System.out.println(",,,,,,,"+list.getCustomer_Id());
		return list;
	}


	@Override
	public int saves(Customer customer, Address add2)
			throws ClassNotFoundException, SQLException, IOException {
		int add=cust.save(customer,add2);
		return add;
	}


	@Override
	public int deletes(String  cust_id) throws ClassNotFoundException, SQLException, IOException {
		int del=cust.deleteCustomer(cust_id);
		return del;
	}


	@Override
	public int addByAdmins(Customer customer) throws ClassNotFoundException,
			SQLException, IOException {
		int del=cust.addByAdmin(customer);
		return del;
	}


	@Override
	public List<Address> retrieveAddressDatas() throws ClassNotFoundException,
			SQLException, IOException {
		List<Address> add=cust.retrieveAddressData();
		return add;
	}


	@Override
	public Customer getCustomerDatas(String id) throws ClassNotFoundException,
			SQLException, IOException {
		Customer c=cust.getCustomerData(id);
		return c;
	}


	//@Override
	/*public int deletes(Customer customer) throws ClassNotFoundException,
			SQLException, IOException {
		// TODO Auto-generated method stub
		return 0;
	}*/


}
