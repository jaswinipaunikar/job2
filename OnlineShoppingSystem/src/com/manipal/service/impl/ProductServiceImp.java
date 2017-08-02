package com.manipal.service.impl;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.manipal.DAO.ProductDAO;
import com.manipal.DAO.jdbc.ConnectionHelper;
import com.manipal.DAO.jdbc.EmployeeDAOImp;
import com.manipal.DAO.jdbc.JdbcProductDAOImpl;
import com.manipal.model.Address;
import com.manipal.model.Employee;
import com.manipal.model.Product;
import com.manipal.service.ProductService;

public class ProductServiceImp implements ProductService{

	JdbcProductDAOImpl obj=new JdbcProductDAOImpl();
	int ins,updt;
/*		@Override
		public int insertDatas(Product p) throws ClassNotFoundException,
				SQLException, IOException {
			// TODO Auto-generated method stub
			return ins=obj.insertData(p);

		}
	*/
	
	
		@Override
		public int updateDatas(Product p) throws ClassNotFoundException,SQLException, IOException {
			return updt=obj.updateData(p);
		
		}
		
		@Override
		public List<Product> viewDatas() throws ClassNotFoundException,
				SQLException, IOException {
		
			return obj.viewData();
			}
		public int insertDatas(String product_Name, InputStream photo,
			Double price, String description, String category_name, String supplier_name) throws ClassNotFoundException, SQLException, IOException {
			ProductDAO productDao=new JdbcProductDAOImpl();
			Product product=new Product();
			product.setProduct_Name(product_Name);
			product.setProduct_Image(photo);
			product.setPrice(price);
			product.setDesc(description);
			
			product.setCategory_Id(category_name);
			product.setSupplier_Id(supplier_name);
			
	
			
			return obj.insertDatas(product);
		}
		public Product searchDatas(String pdt_name) throws ClassNotFoundException, SQLException, IOException {
			
			// TODO Auto-generated method stub
			return obj.searchDatas(pdt_name);
				
				
		}

		@Override
		public Product getPros(String product_id) throws ClassNotFoundException,
			IOException, SQLException {
			return obj.getPro(product_id);
		}

		}


