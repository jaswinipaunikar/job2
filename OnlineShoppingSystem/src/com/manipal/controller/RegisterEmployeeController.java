package com.manipal.controller;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.manipal.DAO.EmployeeDAO;
import com.manipal.model.Address;
import com.manipal.model.Employee;
import com.manipal.service.impl.EmployeeServiceImp;
import com.manipal.service.impl.LoginServiceImpl;



@WebServlet("/RegisterEmployeeController")

public class RegisterEmployeeController extends HttpServlet {
		protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
			
			String employee_Username = request.getParameter("empusername");
			String employee_Password = request.getParameter("emppassword");
			String employee_First_Name = request.getParameter("empfirstname");
			String employee_Last_Name = request.getParameter("emplastname");
			String employee_Date_Of_Birth = request.getParameter("empdateofbirth");
			String employee_Email = request.getParameter("empemail");
			String employee_Contact_No=request.getParameter("empcontactno");
			String address=request.getParameter("address");
			String address_City=request.getParameter("city");
			String address_State=request.getParameter("state");
			String address_Country=request.getParameter("country");
			String address_Zipcode=request.getParameter("zipcode");
		
			Address a= new Address(address,address_City,address_State,address_Country,address_Zipcode);
			Employee emp =new Employee(employee_Username,employee_Password,employee_First_Name,employee_Last_Name,employee_Date_Of_Birth,employee_Email,employee_Contact_No);
			EmployeeServiceImp empservice = new EmployeeServiceImp();
			
			
					
					
						 int status = 0;
						try {
							status = empservice.insertDatas(emp,a);
						} catch (ClassNotFoundException e) {
							// TODO Auto-generated catch block
							System.out.print("INSIDE TRY");
							e.printStackTrace();
						} catch (SQLException e) {
							// TODO Auto-generated catch block
							System.out.println("exception in emp insertion");
							e.printStackTrace();
						}
					if(status!=0){
						RequestDispatcher rd = request.getRequestDispatcher("ViewEmployee.jsp");//"Emp_registered"
						rd.forward(request, response);	
						System.out.println("data inserted");
					}
					else{
						RequestDispatcher rd1 = request.getRequestDispatcher("ViewEmployee.jsp");//"Emp_not_registerd"
						rd1.forward(request, response);
						System.out.println("data not inserted");
		}
				
	}
	}

	
