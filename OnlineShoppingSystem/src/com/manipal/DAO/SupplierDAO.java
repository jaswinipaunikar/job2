package com.manipal.DAO;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.manipal.model.Address;
//import com.manipal.model.Orders;
import com.manipal.model.Supplier;

public interface SupplierDAO {

	public List<Supplier> retrieveSupplierData() throws ClassNotFoundException, SQLException, IOException;

	List<Supplier> viewData() throws ClassNotFoundException, SQLException,
	IOException;

	List<Address> viewData1() throws ClassNotFoundException, SQLException,
	IOException;
	
	public int updateData(Supplier c,Address a)throws ClassNotFoundException, SQLException, IOException;
	
	public int insertData(Supplier c, Address a) throws ClassNotFoundException, SQLException, IOException;
	public int deleteData(String supplier_Id)throws ClassNotFoundException, SQLException, IOException;

	

	/*public List<Orders> insertorder() throws ClassNotFoundException, SQLException,
			IOException;
	*/


	
}



