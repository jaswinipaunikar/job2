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

import com.manipal.DAO.CategoryDAO;
import com.manipal.model.Category;
import com.manipal.service.impl.CategoryServiceImp;
import com.manipal.service.impl.LoginServiceImpl;


/**
 * Servlet implementation class LoginController1
 */
@WebServlet("/AddCategoryController")
public class AddCategoryController extends HttpServlet {
	
	
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String cat_id = request.getParameter("cId");
		String cat_name = request.getParameter("catname");
		String des_name= request.getParameter("catdesc");
		System.out.println(cat_name);
		
		
	
		Category c =new Category(cat_id, cat_name, des_name);
		CategoryServiceImp cat = new CategoryServiceImp();
		System.out.println(c.getCategory_Name());		
				
				
					 int status = 0;
					try {
						status = cat.insertDatas( c);
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				if(status!=0){
					System.out.println("data inserted");
				}
				else{
					System.out.println("data not inserted");
	}
				RequestDispatcher rd=request.getRequestDispatcher("ViewCategory.jsp");
				rd.forward(request, response);

}
}
