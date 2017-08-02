package com.manipal.service.impl;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.manipal.DAO.CartDAO;
import com.manipal.DAO.EmployeeDAO;
import com.manipal.DAO.jdbc.AddCartDAOImp;
import com.manipal.DAO.jdbc.EmployeeDAOImp;
import com.manipal.model.Address;
import com.manipal.model.Cart;
import com.manipal.model.Employee;
import com.manipal.model.Product;
import com.manipal.service.CartService;


public class CartServiceImp implements CartService{
AddCartDAOImp obj=new AddCartDAOImp();
int ins,updt;

public int insertDatas(Cart c) throws ClassNotFoundException, SQLException, IOException {
	return ins=obj.insertData(c);

	
}
CartDAO sd = new AddCartDAOImp();
@Override
public List<Cart> viewDatas() {
	List<Cart> st=sd.viewlist();
	return st ;
}

@Override
public List<Product> viewDatas1() {
	List<Product> dt=sd.viewlist1();
	return dt ;
}
}