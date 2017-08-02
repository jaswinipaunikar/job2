package com.manipal.DAO.jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.manipal.DAO.ProductDAO;
import com.manipal.model.Address;
import com.manipal.model.Employee;
import com.manipal.model.Product;

public class JdbcProductDAOImpl implements ProductDAO{

	@Override
	public List<Product> viewData() throws ClassNotFoundException,
			SQLException, IOException {
		
		String sql = "select * from Product where product_status='active'";
		Connection con = ConnectionHelper.getMySqlConnection(); 
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(sql);
		
		
		List<Product> list = new ArrayList<Product>();
		while(rs.next())
		{
			Product product=new Product();
			product.setProduct_Id(rs.getString(1));
			product.setProduct_Name(rs.getString(2));
			product.setDesc(rs.getString(3));
			product.setPrice(rs.getDouble(4));
			product.setStatus(rs.getString(5));
			product.setProduct_Image(rs.getBinaryStream(8));
			
			list.add(product);
			
			
			/*product.setSupplier_Id(rs.getString(7));*/
			
			
			/*String product_Id=rs.getString(1);
			String product_Name = rs.getString(2);
			String product_Description = rs.getString(3);
			Double product_Price = rs.getDouble(4);	
			String product_Status=rs.getString(5);
			String category_Id=rs.getString(6);
			String supplier_Id=rs.getString(7);
			
			
			
			Product p= new Product(product_Id,product_Name, product_Description, product_Price,product_Status,category_Id,supplier_Id);
			p.set*/
			
			
			
			/*list.add(p);	*/
	}
		return list;
	}

	
	
	
	@Override
	public int updateData(Product p) throws ClassNotFoundException,
			SQLException, IOException {

		String sql = "update product set product_Name=?,product_desc=?,product_price=? where product_id=? ";
		Connection con = ConnectionHelper.getMySqlConnection();
		PreparedStatement pst =  con.prepareStatement(sql);
		  
		
		pst.setString(1, p.getProduct_Name());
		pst.setString(2, p.getDesc());
		
		pst.setDouble(3, p.getPrice());
		pst.setString(4, p.getProduct_Id());
		
		System.out.println("after update");
		int i= pst.executeUpdate();
		System.out.println("after update2");
		return i;
	}

	
	

	@Override
	public int insertDatas(Product p) throws ClassNotFoundException,
			SQLException, IOException {
		// TODO Auto-generated method stub
		/*String sql = "insert into product(PRODUCT_ID,PRODUCT_NAME,PRODUCT_DESC,PRODUCT_PRICE,PRODUCT_STATUS,CATEGORY_ID,SUPPLIER_ID,Product_image)"
				+ " values(product_seq.NEXTVAL,?,?,?,'active',(Select category_id from category where category_name=?),"
				+ "(Select supplier_id from supplier where supplier_name=?),?)";
	
		String sql = "insert into product(PRODUCT_ID,PRODUCT_NAME,PRODUCT_DESC,PRODUCT_PRICE,PRODUCT_STATUS,CATEGORY_ID,SUPPLIER_ID,Product_image)"
				+ " values(product_seq.NEXTVAL,?,?,?,'active',(select category_id from category where category_name=?),"
				+ "(select supplier_id from supplier where supplier_name=?),?)";
	*/	
		
		String sql = "insert into product(PRODUCT_NAME,PRODUCT_DESC,PRODUCT_PRICE,PRODUCT_STATUS,CATEGORY_ID,Product_image)"
				+ " values(?,?,?,?,(select category_id from category where category_name=?),?)";
	
		
	Connection con = ConnectionHelper.getMySqlConnection();
	PreparedStatement pst =  con.prepareStatement(sql);
	pst.setString(1,p.getProduct_Name());
	pst.setString(2,p.getDesc());
	pst.setDouble(3,p.getPrice());
	pst.setString(4, "active");
	
	pst.setString(5,p.getCategory_Id());
	//pst.setString(5,p.getSupplier_Id());
	
	pst.setBlob(6, p.getProduct_Image());
	System.out.println("categeoryname"+p.getCategory_Id()+"suppel "+p.getSupplier_Id());
	int i= pst.executeUpdate();
	System.out.println(i+"rows");
	return i;
		}
	
	
	public Product searchDatas(String pdt_name) throws ClassNotFoundException, SQLException, IOException {
		Product p1 = null;

		System.out.println("initialized to null ");
		Connection con = ConnectionHelper.getMySqlConnection(); 
		Statement st = con.createStatement();
		
		String sql = "select * from Product where product_Name='"+pdt_name+"'";
		ResultSet rs = st.executeQuery(sql);
		System.out.println(rs);
		while(rs.next()){
			
			String product_Id=rs.getString(1);
			String product_Name = rs.getString(2);
			String product_Description = rs.getString(3);
			Double product_Price = rs.getDouble(4);	
			String product_Status=rs.getString(5);
			String category_Id=rs.getString(6);
			String supplier_Id=rs.getString(7);
			
	p1= new Product(product_Id,product_Name, product_Description, product_Price,product_Status,category_Id,supplier_Id);
	System.out.println(product_Id+product_Name+ " "+product_Description+" ");
	
		}
		
		return p1;
		

	}




	@Override
	public Product getPro(String product_id) throws ClassNotFoundException,
			SQLException, IOException {
		Product p1 = null;

		System.out.println("initialized to null ");
		Connection con = ConnectionHelper.getMySqlConnection(); 
		Statement st = con.createStatement();
		
		String sql = "select * from Product where product_Id='"+product_id+"'";
		ResultSet rs = st.executeQuery(sql);
		System.out.println(rs);
		while(rs.next()){
			
			String product_Id=rs.getString(1);
			String product_Name = rs.getString(2);
			String product_Description = rs.getString(3);
			Double product_Price = rs.getDouble(4);	
			String product_Status=rs.getString(5);
			String category_Id=rs.getString(6);
			String supplier_Id=rs.getString(7);
			
	p1= new Product(product_Id,product_Name, product_Description, product_Price,product_Status,category_Id,supplier_Id);
	System.out.println(product_Id+product_Name+ " "+product_Description+" ");
	
		}
		
		return p1;
	}
	}
	/*
	@Override
	public int insertData(Product p) throws ClassNotFoundException,
			SQLException, IOException {
		// TODO Auto-generated method stub
		return 0;
	}

*/
/*@Override
public int updateData(Employee emp) throws ClassNotFoundException,
		SQLException, IOException {

	String sql = "update employee set employee_First_Name=?, employee_Email=? where employee_Id=? ";
	Connection con = ConnectionHelper.getMySqlConnection();
	PreparedStatement pst =  con.prepareStatement(sql);
	pst.setString(1, emp.getEmployee_Id());
	pst.setString(4, emp.getEmployee_First_Name());
	pst.setString(5, emp.getEmployee_Last_Name());
	pst.setString(8, emp.getEmployee_Email());
	pst.setString(6, emp.getEmployee_Date_Of_Birth());
	pst.setString(2, emp.getEmployee_Username());
	pst.setString(3, emp.getEmployee_Password());
	pst.setString(7, emp.getEmployee_Contact_No());
	//pst.setString(9, emp.getEmployee_Address_Id());
	int i= pst.executeUpdate();
	return i;
}*/





	/*
	@Override
	public int insertData(Product p) throws ClassNotFoundException,
		SQLException, IOException {
	
		String sql = "insert into product(PRODUCT_ID,PRODUCT_NAME,PRODUCT_DESC,PRODUCT_PRICE,PRODUCT_STATUS,CATEGORY_ID,SUPPLIER_ID,Product_image)"
				+ " values(product_seq.NEXTVAL,?,?,?,'active',1,1,?)";
		
	Connection con = ConnectionHelper.getMySqlConnection();
	
	PreparedStatement pst =  con.prepareStatement(sql);
	
	pst.setString(1,p.getProduct_Name());
	pst.setString(2,p.getDesc());
	
	pst.setDouble(3,p.getPrice());
	pst.setBlob(4,p.getProduct_Image());
	
	int i= pst.executeUpdate();
	return i;
	
	
}

*/
	
	