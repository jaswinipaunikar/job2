package com.manipal.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.manipal.model.Address;
import com.manipal.model.Customer;

public interface CustomerService
{

	
	//insert
	public int saves(Customer customer, Address add2) throws ClassNotFoundException,
			SQLException, IOException;
	//view
	public List<Customer> retrieveCustomerDatas()throws ClassNotFoundException, SQLException, IOException;
	public List<Address> retrieveAddressDatas()throws ClassNotFoundException, SQLException, IOException;
	/*//delete
	public int deletes(Customer customer, Address add2) throws ClassNotFoundException,
			SQLException, IOException;
	*/
	public int deletes(String  cust_id) throws ClassNotFoundException, SQLException, IOException;
	
	public int addByAdmins(Customer customer) throws ClassNotFoundException,
	SQLException, IOException;
	
	public Customer getCustomerDatas(String id)throws ClassNotFoundException, SQLException, IOException;
	
}
