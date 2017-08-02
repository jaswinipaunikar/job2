package com.manipal.DAO.jdbc;


import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

import com.manipal.DAO.CategoryDAO;
import com.manipal.model.Category;



public class CategoryDaoImp  implements CategoryDAO
{
	
	

	@Override
	public int insertData(Category c) throws ClassNotFoundException,
			SQLException, IOException {
		String sql = "insert into category(CATEGORY_NAME, CATEGORY_DESC,category_status) values(?,?,'active')";
		Connection con = ConnectionHelper.getMySqlConnection();
		PreparedStatement pst =  con.prepareStatement(sql);
		System.out.println(sql);
		pst.setString(1, c.getCategory_Name());
		pst.setString(2, c.getDescription());
		
		int i= pst.executeUpdate();
		return i;
	}

	
	@Override
	public int updateData(Category c) throws ClassNotFoundException,
			SQLException, IOException {

		String sql = "update category set category_Name=?, category_desc=? where category_Id=? ";
		Connection con = ConnectionHelper.getMySqlConnection();
		PreparedStatement pst =  con.prepareStatement(sql);
		pst.setString(1, c.getCategory_Name());
		pst.setString(2, c.getDescription());
		pst.setString(3, c.getCategory_Id());
		int i= pst.executeUpdate();
		return i;
	}

	@Override
	public List<Category> viewData() throws ClassNotFoundException,SQLException, IOException {
		String sql = "select * from category where category_status='active'";
		Connection con = ConnectionHelper.getMySqlConnection(); 
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(sql);
		List<Category> list = new ArrayList<Category>();
		while(rs.next()){
			String cat_id = rs.getString(1);
			String cat_name = rs.getString(2);
			String cat_description = rs.getString(3);	
			String cat_status=rs.getString(4);
			Category r= new Category(cat_id, cat_name, cat_description, cat_status);
			list.add(r);	
	}
		return list;
	}



	@Override
	public int deleteData(String cat_id) throws ClassNotFoundException,
			SQLException, IOException {
		int i=0;
		PreparedStatement ps=null;
		String str = "update Category set Category_status='inactive' where category_Id="+cat_id;
		Connection con = ConnectionHelper.getMySqlConnection();
			ps=con.prepareStatement(str);
			i= ps.executeUpdate();
			if(i!=0){
				System.out.println("Data Deleted");
			}
			else{
				System.out.println("Data not Deleted");
			}
		return i;
	}

	@Override
	public Category catDetail(String cat_Id) throws ClassNotFoundException, IOException {
		// TODO Auto-generated method stub
		Category c=null;
		
		try
		{
			Connection con=ConnectionHelper.getMySqlConnection();
			PreparedStatement pst=con.prepareStatement("select * from Category where category_id=?");
			pst.setString(1, cat_Id);
			ResultSet rs=pst.executeQuery();
			while(rs.next())
			{
				 c= new Category();
				 rs.getString(1);
				 rs.getString(2);
				 rs.getString(3);
			
			}
		}
		catch(SQLException s)
		{
			s.printStackTrace();
		}
		return c;

	}
	
	@Override
	public int categoryDeleteDetail(String cat_Id) throws ClassNotFoundException, IOException {
		// TODO Auto-generated method stub
	
		int rows=0;
		try
		{
			Connection con=ConnectionHelper.getMySqlConnection();
			String sql = "update Category set Category_Status=? where category_Id=?";
			PreparedStatement pst=con.prepareStatement(sql);
			System.out.println(sql);
		
		pst.setString(1,"Inactive");
		pst.setString(2,cat_Id);
		 rows=pst.executeUpdate();
		System.out.println(rows);
		if(rows==1)
			System.out.println("record deleted!!!");
		
		}
		catch(SQLException s)
		{
			s.printStackTrace();
		}
		return rows;

		
	}


	
	


	
	
}

