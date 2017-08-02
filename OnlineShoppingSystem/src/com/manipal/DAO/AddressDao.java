package com.manipal.DAO;

import java.io.IOException;
import java.sql.SQLException;

import com.manipal.model.Address;
import com.manipal.model.Customer;

public interface AddressDao 
{
	public int insertAddress(Address a) throws ClassNotFoundException,
	SQLException, IOException;
	
	public Address getAddressData(String ids) throws ClassNotFoundException,
	SQLException, IOException;
}
