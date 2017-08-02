package com.manipal.DAO;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.manipal.model.Address;
import com.manipal.model.Customer;

public interface CustomerDAO 
{
	public List<Customer> retrieveCustomerData()throws ClassNotFoundException, SQLException, IOException;
	
	public List<Address> retrieveAddressData()throws ClassNotFoundException, SQLException, IOException;
	

	public int save(Customer customer, Address a) throws ClassNotFoundException,
			SQLException, IOException;

	
	/*int deleteCustomer(Customer customer) throws ClassNotFoundException,
			SQLException, IOException;
	*/
	public int addByAdmin(Customer customer) throws ClassNotFoundException,
	SQLException, IOException;
	
	public Customer getCustomerData(String id)throws ClassNotFoundException, SQLException, IOException;

	public int deleteCustomer(String cust_id) throws ClassNotFoundException,
			SQLException, IOException;
	
}
