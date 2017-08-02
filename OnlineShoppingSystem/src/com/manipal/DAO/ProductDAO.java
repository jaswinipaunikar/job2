package com.manipal.DAO;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.manipal.model.Product;

public interface ProductDAO {
	
	
		/*int insertData(Product p) throws ClassNotFoundException, SQLException,
			IOException;
*/
		int updateData(Product p) throws ClassNotFoundException, SQLException,
				IOException;
		
		public List<Product> viewData()throws ClassNotFoundException, SQLException, IOException;

		int insertDatas(Product p) throws ClassNotFoundException, SQLException,
				IOException;
		Product searchDatas(String pdt_name) throws ClassNotFoundException, SQLException,
		IOException;

		public Product getPro(String product_id)throws ClassNotFoundException, SQLException,
		IOException;

}
