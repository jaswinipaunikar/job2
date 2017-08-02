package com.manipal.DAO.jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.manipal.DAO.CartDAO;
import com.manipal.model.Address;
import com.manipal.model.Cart;
import com.manipal.model.Employee;
import com.manipal.model.Product;


public class AddCartDAOImp implements CartDAO {

	public int insertData(Cart c) throws ClassNotFoundException, SQLException, IOException {
		

				
				String sql = "insert into cart values(cart_seq.NEXTVAL,?,?)";
				
				
				Connection con = ConnectionHelper.getMySqlConnection();
				PreparedStatement pst =  con.prepareStatement(sql);
				/*PreparedStatement pst1 =  con.prepareStatement(sql1);*/
				//pst.setString(1, c.getCustomer_Id());
				
				pst.setString(1, c.getProduct_Id());
				pst.setString(2, c.gettotal_price());
				int b= pst.executeUpdate();
				System.out.println("ADDED INTO CART TABLE");
				return b;
		
	}



	ConnectionHelper conHelp=new ConnectionHelper();
	Connection con = null;
	Statement stmt;
	ResultSet rs;
	public List<Cart> viewlist(){
		
		List<Cart> ordList =new ArrayList<Cart>();
		
		try {
			con=ConnectionHelper.getMySqlConnection();
			  
			stmt = (Statement) con.createStatement();
			System.out.println(stmt);
			String sql="Select * from cart where customer_id=?";
			rs = stmt.executeQuery(sql);
			System.out.println("after query cart");
			while (rs.next()) {
			System.out.println("inside query loop");
				Cart c=new Cart();
				c.setCart_Id(rs.getString(1));
				//c.setCustomer_Id(rs.getString(2));
				c.setProduct_Id(rs.getString(2));
				c.settotal_price(rs.getString(3));
			
				//System.out.println(c.getQuantity_In_Cart());
				ordList.add(c);
				
}
con.close();//return ordList;
			
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
		
		return ordList;
	}

	@Override
	public List<Product> viewlist1()
	{
		List<Product> ordList =new ArrayList<Product>();
		try {
			con=ConnectionHelper.getMySqlConnection();

			stmt = (Statement) con.createStatement();
			System.out.println(stmt);
			rs = stmt.executeQuery("select * from product where product_id=(select product_id from cart where cart_id='2' )");


			System.out.println("after product query");

			while (rs.next()) 
			{

System.out.println("inside product loop");
				Product rd = new Product();
				rd.setProduct_Id(rs.getString(1));
				rd.setProduct_Name(rs.getString(2));
				rd.setDesc(rs.getString(3));
				rd.setPrice(rs.getDouble(4));
				System.out.println("After setting product");

				System.out.println(rd);
				ordList.add(rd);
				
			}
			con.close();//return ordList;


		} 
		catch (ClassNotFoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


		return ordList;



}

}
