
	
	package com.manipal.controller;

	import java.io.IOException;

	import javax.servlet.ServletException;
	import javax.servlet.annotation.WebServlet;
	import javax.servlet.http.HttpServlet;
	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;

	import com.manipal.service.EmployeeService;
	import com.manipal.service.impl.EmployeeServiceImp;

	@WebServlet("/EmployeeViewController")
	public class EmployeeViewController  extends HttpServlet {
		private static final long serialVersionUID = 1L;
	       
	    public EmployeeViewController() {
	        super();
	        // TODO Auto-generated constructor stub
	    }
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			// TODO Auto-generated method stub
		}

		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			EmployeeService rs= new EmployeeServiceImp();
			EmployeeService rs1= new EmployeeServiceImp();
		}

	}


