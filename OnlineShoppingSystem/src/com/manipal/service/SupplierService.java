package com.manipal.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.manipal.model.Address;
//import com.manipal.model.Orders;
import com.manipal.model.Supplier;

public interface SupplierService {
	public int insertDatas(Supplier c, Address a) throws ClassNotFoundException, SQLException, IOException;
	public List<Supplier> retrieveSupplierData()
			throws ClassNotFoundException, SQLException, IOException;



	public int updateData(Supplier c,Address a)
			throws ClassNotFoundException, SQLException, IOException;


	public List<Address> viewData1()
			throws ClassNotFoundException, SQLException, IOException;



	public	List<Supplier> viewData()
			throws ClassNotFoundException, SQLException, IOException;

	public void deleteData(String supplier_Id) ;
	/*
List<Orders> insertorder() throws ClassNotFoundException, SQLException,
		IOException;
	 */
}
