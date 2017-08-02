package com.manipal.service.impl;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.manipal.DAO.CategoryDAO;
import com.manipal.DAO.jdbc.CategoryDaoImp;
import com.manipal.DAO.jdbc.ConnectionHelper;
import com.manipal.model.Category;
import com.manipal.service.CategoryService;


public class CategoryServiceImp implements CategoryService{
CategoryDaoImp obj=new CategoryDaoImp();
int ins,updt;
private int com;

	@Override
	public int insertDatas(Category c) throws ClassNotFoundException,
			SQLException, IOException {
		return ins=obj.insertData(c);
	}

	@Override
	public int updateDatas(Category c) throws ClassNotFoundException,SQLException, IOException {
		return updt=obj.updateData(c);
	}

	@Override
	public List<Category> viewDatas() throws ClassNotFoundException,
			SQLException, IOException {
		// TODO Auto-generated method stub
		return obj.viewData();
	}
	



	@Override
	public void deleteyDatas(String cat_id) {
		// TODO Auto-generated method stub
		try {
			obj.deleteData(cat_id);
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

	public Category catDetails(String cat_Id) throws ClassNotFoundException,
			IOException {
		CategoryDaoImp obj= new CategoryDaoImp();
		return obj.catDetail(cat_Id);
	}

	public int categoryDeleteDetails(String cat_Id) throws ClassNotFoundException, IOException{
		CategoryDaoImp obj= new CategoryDaoImp();
		return   com = obj.categoryDeleteDetail(cat_Id);
		
	}
	
	
		
}
