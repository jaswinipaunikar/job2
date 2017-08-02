package com.manipal.DAO;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.manipal.model.Address;
import com.manipal.model.Customer;
import com.manipal.model.Cart;
import com.manipal.model.Employee;
import com.manipal.model.Product;


public interface CartDAO {
	public int insertData(Cart c) throws ClassNotFoundException, SQLException, IOException;
     
	List<Cart> viewlist();
	List<Product> viewlist1();
	
}
