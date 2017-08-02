package com.manipal.controller;
	import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
	import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.manipal.service.impl.EmployeeServiceImp;



	/**
	 * Servlet implementation class CategoryDeleteController
	 */
	@WebServlet("/EmployeeDeleteController")
	public class EmployeeDeleteController extends HttpServlet {
		private static final long serialVersionUID = 1L;
	  
	    public EmployeeDeleteController() {
	        super();
	      
	    }

		
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
		}

		
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
			PrintWriter out= response.getWriter();
			String emp_Id=request.getParameter("empid");
			System.out.println(emp_Id);
			EmployeeServiceImp emp=new EmployeeServiceImp();
			int a=emp.deleteDatas(emp_Id);
			
			if(a==1){
			RequestDispatcher rd=request.getRequestDispatcher("ViewEmployee.jsp");
			rd.forward(request, response);
			}
			else
			{
				RequestDispatcher rd=request.getRequestDispatcher("ViewEmployee.jsp");
				rd.forward(request, response);
				}
				
			
			
		}

	}



