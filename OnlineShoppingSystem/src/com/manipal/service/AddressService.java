package com.manipal.service;

import java.io.IOException;
import java.sql.SQLException;

import com.manipal.model.Address;

public interface AddressService
{
	public int insAddress(Address add)throws ClassNotFoundException,
	SQLException, IOException ;
	
	public Address getAddressData(String ids) throws ClassNotFoundException,
	SQLException, IOException ;
}
