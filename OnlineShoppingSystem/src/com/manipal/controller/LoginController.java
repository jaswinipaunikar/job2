package com.manipal.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.manipal.DAO.jdbc.JdbcLoginDAOImpl;
import com.manipal.model.Customer;
import com.manipal.service.impl.LoginServiceImpl;

/**
 * Servlet implementation class LoginController1
 */
@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException 
	{
		
	response.setContentType("text/html");
	String username = request.getParameter("custUserName");
	String password = request.getParameter("custPassword");
	System.out.println("\n login controller...checking...");
	
	//HttpSession session=request.getSession(true);
	/*session.setAttribute("custUserName1", username);
	session.setAttribute("custPassword", password);*/
	
	//System.out.println("fetching the parameters..");
			
	boolean flag=false;
	
	try {
		
		HttpSession session=request.getSession();
		LoginServiceImpl user = new LoginServiceImpl();
		int i=0;	
		List<Customer> list1 = user.validates();
		
		for(Customer customerDetails : list1)
		{				
			if(username.equals(customerDetails.getCustomer_Username())&&(password.equals(customerDetails.getCustomer_Password())))
			{			
				System.out.println("matching...");
				
				flag=true;
				
			}
			
		}
			if(flag==true)
			{
				session.setAttribute("username", username);
				session.setAttribute("msg", "Login Successfull..!!");
				RequestDispatcher rd = request.getRequestDispatcher("cust_home.jsp");
				rd.forward(request, response);	
			}
			else
			{
				session.setAttribute("msg", "Invalid Login Credentials..!!");
				RequestDispatcher rd1 = request.getRequestDispatcher("login.jsp");
				rd1.forward(request, response);
				System.out.println("wrong username");
			}
			
			
		
	} catch (ClassNotFoundException | SQLException e) {
		e.getStackTrace();
	}
}

}
