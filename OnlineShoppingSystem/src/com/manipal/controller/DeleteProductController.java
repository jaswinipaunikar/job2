package com.manipal.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.manipal.DAO.jdbc.DeleteProductServiceImpl;
import com.manipal.service.impl.DeleteProductService;

/**
 * Servlet implementation class DeleteRoleController
 */
@WebServlet("/DeleteProductController")
public class DeleteProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteProductController() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
        String Product_Id=request.getParameter("pdtid");
		System.out.println(Product_Id);
		try{
			DeleteProductService dr=new DeleteProductServiceImpl();
			
			boolean flag=dr.deleteProduct(Product_Id);
			
			HttpSession session=request.getSession();
			
			if(flag){
			/*	session.setAttribute("msgprodel", "Delete successful");*/
				System.out.println("record deleted successfully");
				RequestDispatcher rd=request.getRequestDispatcher("viewProductA.jsp");
				rd.forward(request, response);
			
				
			}
				
			else{
				/*session.setAttribute("msgprodel", "Delete unsuccessful");*/
				System.out.println("records are not deleted");
				RequestDispatcher rd=request.getRequestDispatcher("viewProductA.jsp");
				rd.forward(request, response);
				
			}
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		response.sendRedirect("Admin.jsp");
		
	}
		
		
		
	}


