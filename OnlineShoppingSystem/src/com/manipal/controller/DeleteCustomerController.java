package com.manipal.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.manipal.model.Category;
import com.manipal.model.Customer;
import com.manipal.service.impl.CategoryServiceImp;
import com.manipal.service.impl.CustomerServiceImp;

/**
 * Servlet implementation class DeleteCustomerController
 */
@WebServlet("/DeleteCustomerController")
public class DeleteCustomerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public DeleteCustomerController() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("In servlet");
		String cust_id=request.getParameter("cust_id");
		System.out.println("After data extraction");

		
		try
		{
			System.out.println("In servlet try");
			Customer c=new Customer();
			System.out.println("After pojo object creation");
			c.getCustomer_Id();
			System.out.println("after obj");
			CustomerServiceImp cobj=new CustomerServiceImp();
			cobj.deletes(cust_id);
			RequestDispatcher rd=request.getRequestDispatcher("ViewCustomer.jsp");
			rd.forward(request, response);
			
		}
		catch(Exception e)
		{
			e.getMessage();
		}

		
	}

}
