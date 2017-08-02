package com.manipal.DAO;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.manipal.model.*;

public interface EmployeeDAO {
	
				
			public int insertData(Employee emp,Address a)throws ClassNotFoundException, SQLException, IOException;
			
			public int deleteData(String emp_Id)throws ClassNotFoundException, SQLException, IOException;
			
			public List<Employee> viewlist()throws ClassNotFoundException, SQLException, IOException;
			
			List<Address> viewlist1();
			
	
			/*public int updateData(Employee emp,Address a)throws ClassNotFoundException, SQLException, IOException;*/
			
		//public List<Employee> viewData();
		
		//	public  List<Address> viewData1();
		
	

 // public String update( String employee_Id, String employee_Username,String employee_Password,String employee_First_Name,String employee_Last_Name, String employee_Date_Of_Birth,String employee_Email,String employee_Contact_No);
	
	
//	public void update1(Employee r);           //1st update
	       
	
	
	
	
	
	// public String updateEmployeeDetails(String employee_Id,String address_Id);          //2nd update




	
		
	}

	
	







