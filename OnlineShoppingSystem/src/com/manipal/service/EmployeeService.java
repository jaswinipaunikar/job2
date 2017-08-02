package com.manipal.service;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.manipal.model.Address;
import com.manipal.model.Employee;
public interface EmployeeService {
	public int insertDatas(Employee emp,Address a) throws ClassNotFoundException, SQLException, IOException;

	//public int updateDatas(Employee emp, Address a) throws ClassNotFoundException, SQLException, IOException;
	
	
	
	
	public int deleteDatas(String emp_Id) ;
	
	


	//void updateEmployeeDetails( String employee_Id,String address_Id, String employee_Username,String employee_Password,String employee_First_Name,String employee_Last_Name, String employee_Date_Of_Birth,String employee_Email,String employee_Contact_No);		//1st update
	
	
	
	
	
	
//	public String editEmployeeDetails(String employee_Id,String address_Id);

	
	List<Employee> viewDatas() throws ClassNotFoundException, SQLException, IOException;
	List<Address> viewDatas1();
	}



