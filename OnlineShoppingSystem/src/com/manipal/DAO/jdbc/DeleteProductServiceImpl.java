package com.manipal.DAO.jdbc;

import com.manipal.DAO.DeleteProductDAO;
import com.manipal.service.impl.DeleteProductService;

public class DeleteProductServiceImpl implements DeleteProductService {

	@Override
	public boolean deleteProduct(String Product_Id) {
DeleteProductDAO del=new JdbcDeleteProductImpl();
		
		
		
		boolean flag=del.deleteProduct(Product_Id);
		
		if(flag)
			return true;
			else
				return false;
		
		
	}

	

}
