package com.manipal.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import org.apache.tomcat.jni.Address;




import javax.servlet.http.HttpSession;

import com.manipal.model.*;
import com.manipal.service.impl.CustomerServiceImp;

@WebServlet("/CustomerEditController")
public class CustomerEditController extends HttpServlet 
{

	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException 
	{
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String frstname = request.getParameter("frstnm");
		String lastnm = request.getParameter("lastnm");
		String dob=request.getParameter("dob");
		String email=request.getParameter("email");
		String ph=request.getParameter("phone");
		String  st="INACTIVE";
		String gender=request.getParameter("gender");
		//String reg=request.getParameter("reg");
		String address=request.getParameter("address");
		String city=request.getParameter("city");
		String state=request.getParameter("state");
		String country=request.getParameter("country");
		String zip=request.getParameter("zipcode");
		System.out.println("usernaem="+username);
		CustomerServiceImp user = new CustomerServiceImp();
		String errorMessage=null;
		boolean flag=false;
	
		try {
			

			Customer cust= new Customer(username, password, frstname,
					lastnm, gender, dob, ph, email, st);
			Address add =new Address(address,city,state,country,zip);
			
			HttpSession session=request.getSession();
			session.setAttribute( username, cust);
			//session.setAttribute("custPassword", password);
			
			
			List<Customer> list = user.retrieveCustomerDatas();
			for (Customer userD : list) 
			{
				System.out.println("in for");
				try{
						if(username.equals(userD.getCustomer_Username()))
						{	System.out.println("1st if");
							errorMessage="User with this username already exists";
							flag=true;
							break;
						}
						else if(email.equals(userD.getCustomer_Email()))
						{
							System.out.println("2nd if");
							errorMessage="This email address already used";
							flag=true;
							break;
						}
						else if(ph.equals(userD.getCustomer_Contact()))
						{		System.out.println("1st if");
							errorMessage="This contact Number already used";
							flag=true;
							break;
						}		
						else
						{
							System.out.println("nn");
							break;
						}
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			}
			if(flag==true)
			{	System.out.println("wrong...");
				request.setAttribute("registerErrorMessage", errorMessage);
				RequestDispatcher rd=request.getRequestDispatcher("RegisterError");
				rd.forward(request, response);
			}
			else
			{
				System.out.println("innn");
				int ins = user.saves(cust,add);
				System.out.println("inserted"+ins);
				String Message="Account created successfully";
				request.setAttribute("registerMessage", Message);
				RequestDispatcher rd=request.getRequestDispatcher("login.jsp");
				rd.forward(request, response);

			}
		}			
		catch (ClassNotFoundException | SQLException e)
		{
			e.getStackTrace();
		}
	}
}
		
		
		
	
	


