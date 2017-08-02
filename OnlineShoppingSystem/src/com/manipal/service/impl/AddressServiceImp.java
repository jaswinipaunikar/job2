package com.manipal.service.impl;

import java.io.IOException;
import java.sql.SQLException;

import com.manipal.DAO.AddressDao;
import com.manipal.DAO.jdbc.AddressImp;
import com.manipal.model.Address;
import com.manipal.service.AddressService;

public class AddressServiceImp implements AddressService{
	 
		AddressImp ad=new AddressImp();
		int added=0;
		@Override
		public int insAddress(Address add) throws ClassNotFoundException,
				SQLException, IOException {
			added=ad.insertAddress(add);
			return added;
		}
		
		//for edit_customer.jsp retrieval
		@Override
		public Address getAddressData(String ids)
				throws ClassNotFoundException, SQLException, IOException {
			Address adds=ad.getAddressData(ids);
			return adds;
		}	
		
	
}
