package com.manipal.service;

import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;
import java.util.List;

import com.manipal.model.Product;

public interface ProductService {
	public int insertDatas(String product_Name,InputStream product_Image,Double price,String desc,String category_name,String supplier_name) throws ClassNotFoundException, SQLException, IOException;

	int updateDatas(Product p) throws ClassNotFoundException, SQLException,
			IOException;
	public List<Product> viewDatas() throws ClassNotFoundException, SQLException, IOException;
	
	public Product searchDatas(String pdt_name) throws ClassNotFoundException,SQLException,IOException;
	
	public Product getPros(String product_id)throws ClassNotFoundException,SQLException,
	IOException;

}
