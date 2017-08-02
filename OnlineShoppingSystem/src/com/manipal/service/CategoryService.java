package com.manipal.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.manipal.model.Category;

public interface CategoryService {
	
	public int insertDatas(Category c) throws ClassNotFoundException, SQLException, IOException;

	public int updateDatas(Category c) throws ClassNotFoundException, SQLException, IOException;
	
	public List<Category> viewDatas() throws ClassNotFoundException, SQLException, IOException;
	
	public void deleteyDatas(String cat_id) ;
	
	public Category catDetails(String cat_Id) throws ClassNotFoundException, IOException;
	
	public int categoryDeleteDetails(String cat_Id) throws ClassNotFoundException, IOException;
}
