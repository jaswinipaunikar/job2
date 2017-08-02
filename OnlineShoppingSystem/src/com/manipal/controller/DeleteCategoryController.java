package com.manipal.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.manipal.model.Category;
import com.manipal.service.impl.CategoryServiceImp;



@WebServlet("/DeleteCategoryController")
public class DeleteCategoryController extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("In servlet");
		String cat_id=request.getParameter("c_id");
		System.out.println("After data extraction");

		
		try
		{
			System.out.println("In servlet try");
			Category c=new Category();
			System.out.println("After pojo object creation");
			c.getCategory_Id();
			System.out.println("after obj");
			CategoryServiceImp cobj=new CategoryServiceImp();
			cobj.categoryDeleteDetails(cat_id);
			RequestDispatcher rd=request.getRequestDispatcher("ViewCategory.jsp");
			rd.forward(request, response);
			
		}
		catch(Exception e)
		{
			e.getMessage();
		}

		
		
	}
}
