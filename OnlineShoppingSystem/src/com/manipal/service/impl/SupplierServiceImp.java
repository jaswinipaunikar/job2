package com.manipal.service.impl;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.manipal.DAO.SupplierDAO;
import com.manipal.DAO.jdbc.SupplierDAOImp;
import com.manipal.DAO.jdbc.ConnectionHelper;
import com.manipal.model.Address;
//import com.manipal.model.Orders;
import com.manipal.model.Supplier;
import com.manipal.service.SupplierService;


public class SupplierServiceImp implements SupplierService{
	SupplierDAOImp obj=new SupplierDAOImp();
int ins,updt;

	

	
	@Override
	public List<Supplier> viewData() throws ClassNotFoundException,
			SQLException, IOException {
		// TODO Auto-generated method stub
		return obj.viewData();
	}




	@Override
	public List<Supplier> retrieveSupplierData() throws ClassNotFoundException,
			SQLException, IOException {
		// TODO Auto-generated method stub
		return null;
	}




	@Override
	public int updateData(Supplier c,Address a) throws ClassNotFoundException,SQLException, IOException {
		return updt=obj.updateData(c,a);
	}




	@Override
	public List<Address> viewData1() throws ClassNotFoundException,
			SQLException, IOException {
		// TODO Auto-generated method stub
		return obj.viewData1();
	}


	@Override
	public void deleteData(String supplier_Id) {
		// TODO Auto-generated method stub
		try {
			obj.deleteData(supplier_Id);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}




	/*public int insertData(Supplier c, Address a) throws ClassNotFoundException, SQLException, IOException {
		int abd=obj.insertData(c, a);
		return abd;
	}
*/



	@Override
	public int insertDatas(Supplier c, Address a)
			throws ClassNotFoundException, SQLException, IOException {
		int abd=obj.insertData(c, a);
		return abd;
	}




	
}
