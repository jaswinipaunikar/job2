package com.manipal.DAO.jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.manipal.DAO.CustomerDAO;
import com.manipal.model.Address;
import com.manipal.model.Customer;

public class JdbcCustomerDao implements CustomerDAO{

	

	@Override
	public int save(Customer customer, Address a) throws ClassNotFoundException,SQLException,IOException {
		System.out.println("in save()");
		Connection con = null;
		int i=0;
		try{
		String sql1 = "insert into address(address,city,state,country,zipcode) values(?,?,?,?,?)";
		
		
		
		
		System.out.println("AFTER QUERY");
		con = ConnectionHelper.getMySqlConnection();
		System.out.println("connected?");
		
		PreparedStatement pst1 =  con.prepareStatement(sql1);
		
		
		pst1.setString(1, a.getAddress());	
		pst1.setString(2, a.getCity());
		pst1.setString(3, a.getState());
		pst1.setString(4, a.getCountry());
		System.out.println("after country..");
		pst1.setString(5, a.getZipcode());
		
		
		int b= pst1.executeUpdate();
		System.out.println("address inserted"+b);
		
		String sql = "insert into customer(CUSTUSER_USERNAME,CUSTOMER_PASSWORD,CUSTOMER_FIRST_NAME,CUSTOMER_LAST_NAME,"
				+ "CUSTOMER_GENDER,CUSTOMER_DOB,CUSTOMER_CONTACT,CUSTOMER_EMAIL,ADDRESS_ID,CUSTOMER_REGISTER_DATE"
				+ ",CUSTOMER_STATUS) "
				+ "values(?,?,?,?,?,?,?,?,?,CURDATE(),?)";
		PreparedStatement pst =  con.prepareStatement(sql);

		pst.setString(1, customer.getCustomer_Username());
		pst.setString(2, customer.getCustomer_Password());
		pst.setString(3, customer.getCustomer_First_Name());
		pst.setString(4, customer.getCustomer_Last_Name());
		pst.setString(5, customer.getCustomer_Gender());
		pst.setString(6, customer.getCustomer_DOB());
		pst.setString(7,customer.getCustomer_Contact());
		pst.setString(8, customer.getCustomer_Email());
		pst.setInt(9, Statement.RETURN_GENERATED_KEYS);
	//	pst.setString(10, );
		//pst.setString(11, customer.getCustomer_Status());
		pst.setString(10, "active");
		System.out.println("aftr reg date");
		System.out.println(customer.getCustomer_Username());

		i= pst.executeUpdate();
		System.out.println("cust inseted");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

		return i;

	
	}
	
	
	

	@Override
	public List<Customer> retrieveCustomerData() throws ClassNotFoundException,
			SQLException, IOException {
		List<Customer>list=new ArrayList<Customer>();
		String sql="select * from Customer where Customer_status='active' ";
		Connection con=ConnectionHelper.getMySqlConnection();
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(sql);
		Customer cust;
		while(rs.next())
		{
			cust=new Customer();
			String customerId = rs.getString(1);
			//System.out.println("id:"+customerId);
			String Custuser=rs.getString(2);
			String customerFirstName = rs.getString(4);
			String customerLastName = rs.getString(5);
			String customerGender = rs.getString(6);
			String customerDOB = rs.getString(7);
			String customerContact = rs.getString(8);
			String customerEmail = rs.getString(9);
			
			String customerRegisterDate = rs.getString(11);
			String customerStatus = rs.getString(12);
			
			Customer c = new Customer(customerId,Custuser,customerFirstName,customerLastName,
					customerGender,customerDOB,customerContact,customerEmail,
					customerRegisterDate,customerStatus);
		//	System.out.println("id::::"+c.getCustomer_Id());
			list.add(c);
			
		}
		return list;
	}
	
	@Override
	public int deleteCustomer(String cust_id) throws ClassNotFoundException,
			SQLException, IOException {
		int rs=0;
		try{
			System.out.println("del strt");
			Connection con=ConnectionHelper.getMySqlConnection();
			/*Statement st=con.createStatement();*/
			/*String id=customer.getCustomer_Id();*/
			System.out.println("del id:"+cust_id);
			//String query="update customer set status=? where customer_Id= ?;";
			
			String query = "update Customer set customer_status = ? where CUSTOMER_ID = ? ";
			
			PreparedStatement pst=con.prepareStatement(query);
			//System.out.println(sql);
	
			pst.setString(1,"Inactive");
			pst.setString(2,cust_id);
			rs=pst.executeUpdate();
			System.out.println(rs);
	if(rs==1)
	{
		System.out.println("record deleted!!!");
	
	}
		
		
		
		
		//rs=st.executeUpdate(query);
		//System.out.println("deleted customer executed");
		//String query1="UPDATE address SET ADDRESS.STATUS ='INACTIVE' WHERE ADDRESS_ID=(SELECT ADDRESS_ID FROM CUSTOMER WHERE CUSTOMER_ID=?)";
		//rs=pst.executeUpdate(query1);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return rs;
	}

	@Override
	public int addByAdmin(Customer customer)
			throws ClassNotFoundException, SQLException, IOException {
		int rs=0;
		try{
			//System.out.println("adding ..");
			Connection con=ConnectionHelper.getMySqlConnection();
			Statement st=con.createStatement();
		String id=customer.getCustomer_Id();
		System.out.println("adding id:"+id);
		
		String query="update customer set CUSTOMER_STATUS='ACTIVE' where customer_Id= "+id;
		rs=st.executeUpdate(query);
		System.out.println("Result"+rs);
		System.out.println("ADDED BY ADMIN..");
		/*String query1="UPDATE address SET ADDRESS.STATUS ='ACTIVE' WHERE ADDRESS_ID=(SELECT ADDRESS_ID FROM CUSTOMER WHERE CUSTOMER_ID="+id+")";
		rs=st.executeUpdate(query1);
*/		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return rs;

	}

	@Override
	public List<Address> retrieveAddressData() throws ClassNotFoundException,
			SQLException, IOException {
		List<Address>list=new ArrayList<Address>();
		String sql="select * from Address ";
		Connection con=ConnectionHelper.getMySqlConnection();
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(sql);
		Address cust;
		while(rs.next())
		{
			cust=new Address();
			String addressID = rs.getString(1);
			System.out.println("id:"+addressID);
			String address = rs.getString(2);
			String city = rs.getString(3);
			String state = rs.getString(4);
			String country = rs.getString(5);
			String status = rs.getString(6);
			Address ad=new Address(addressID,address,city,state,country,status);
			//System.out.println("id::::"+c.getCustomer_Id());
			list.add(ad);
			
		}
		return list;
	}




	@Override
	public Customer getCustomerData(String id) throws ClassNotFoundException,
			SQLException, IOException {
		Customer c=new Customer();
		String ids=id;
		String sql="select * from Customer where Customer_id='ids'";
		Connection con=ConnectionHelper.getMySqlConnection();
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(sql);
		Customer cust;
		while(rs.next())
		{
			cust=new Customer();
			String customerId = rs.getString(1);
			System.out.println("id:"+customerId);
			String Custuser=rs.getString(2);
			String customerFirstName = rs.getString(4);
			String customerLastName = rs.getString(5);
			String customerGender = rs.getString(6);
			String customerDOB = rs.getString(7);
			String customerContact = rs.getString(8);
			String customerEmail = rs.getString(9);
			
			String customerRegisterDate = rs.getString(11);
			String customerStatus = rs.getString(12);
			
			c = new Customer(customerId,Custuser,customerFirstName,customerLastName,
					customerGender,customerDOB,customerContact,customerEmail,
					customerRegisterDate,customerStatus);
			System.out.println("id::::"+c.getCustomer_Id());
		
			
		}
		return c;
	
	}


}
