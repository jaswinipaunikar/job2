package com.manipal.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.manipal.model.Address;
import com.manipal.model.Customer;
import com.manipal.service.impl.CustomerServiceImp;

/**
 * Servlet implementation class CustomerDelete
 */
@WebServlet("/CustomerDelete")
public class CustomerDelete extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String id = request.getParameter("customerID");
		
		System.out.println("in servlet");
		CustomerServiceImp user = new CustomerServiceImp();
		try
		{
		
			Customer c=new Customer(id);
			
			System.out.println("fetching..");
			//int del = user.deletes(c);
		//	System.out.println("deleted"+del);

		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
