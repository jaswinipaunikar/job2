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



@WebServlet("/UpdateCategoryController")
public class UpdateCategoryController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public UpdateCategoryController() {
        super();
        
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("In servlet");
		String catid=request.getParameter("cId");
		String catname=request.getParameter("catname");
		String catdesc=request.getParameter("catdesc");
		String status=request.getParameter("status");
		
		

		System.out.println("After data extraction");

		
		try
		{
			System.out.println("In servlet try");
			Category c=new Category(catid, catname, catdesc);
			System.out.println("After pojo object creation");
			CategoryServiceImp cobj=new CategoryServiceImp();
			cobj.updateDatas(c);
			System.out.println("hello");
			RequestDispatcher rd=request.getRequestDispatcher("ViewCategory.jsp");
			rd.forward(request, response);
			
		}
		catch(Exception e)
		{
			e.getMessage();
		}
		RequestDispatcher rd=request.getRequestDispatcher("ViewCategory.jsp");
		rd.forward(request, response);
		
	
	}

}
