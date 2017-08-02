package com.manipal.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.manipal.model.Customer;
import com.manipal.service.impl.CustomerServiceImp;

/**
 * Servlet implementation class AddCustomerByAdmin
 */
@WebServlet("/AddCustomerByAdmin")
public class AddCustomerByAdmin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String id = request.getParameter("customerID");
		int del =0;
		System.out.println("Id on controller"+id);
		System.out.println("adding to list..");
		CustomerServiceImp user = new CustomerServiceImp();
		try
		{
		
			Customer c=new Customer(id);
			
			System.out.println("fetching..");
			del = user.addByAdmins(c);
			System.out.println("added"+del);
			if(del!=0)
			{
				RequestDispatcher rd=request.getRequestDispatcher("addCustomer.jsp");
				rd.forward(request, response);
			}
			else
			{
				
				

				RequestDispatcher rd=request.getRequestDispatcher("ErrorAdminLogin.jsp");
				rd.forward(request, response);
				
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		  
		  
		  
		

	}

}
