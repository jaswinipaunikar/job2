package com.manipal.DAO;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.manipal.model.*;

public interface CategoryDAO {
	
		
	public int insertData(Category c)throws ClassNotFoundException, SQLException, IOException;
	
	public int updateData(Category c)throws ClassNotFoundException, SQLException, IOException;
	
	public List<Category> viewData()throws ClassNotFoundException, SQLException, IOException;
	
	public int deleteData(String cat_id)throws ClassNotFoundException, SQLException, IOException;

	public Category catDetail(String cat_Id) throws ClassNotFoundException, IOException;

	public int categoryDeleteDetail(String cat_Id) throws ClassNotFoundException,
			IOException;

	
}
