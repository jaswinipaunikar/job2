package com.manipal.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.manipal.DAO.jdbc.ConnectionHelper;
import com.manipal.model.Product;
import com.manipal.service.impl.ProductServiceImp;

@WebServlet("/SearchProduct")
public class SearchProductController extends HttpServlet {
    public SearchProductController() {
        super();
    }

    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String product_Name=request.getParameter("search");
		System.out.println("a");
		Product p =new Product(product_Name);
		ProductServiceImp psi = new ProductServiceImp();
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
	
		String query = "select * from Product where UPPER(product_name)=upper('"+product_Name+"')";
		Connection con;
		try {
			con = ConnectionHelper.getMySqlConnection();
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(query);
			out.println("<table border='1'><tr><th>Row Num</th><th>Product Name</th><th>Product Description</th><th> Price</th></tr>");
			while(rs.next())
			{

			out.println("<tr><td>"+rs.getString(1)+"</td><td>"+rs.getString(2)+"</td><td>"+rs.getString(3)+"</td><td>"+rs.getString(4)+"</td></tr>");
			}
			out.println("</table>");
			con.close();
			System.out.println("Disconnected from database");

			RequestDispatcher rd=request.getRequestDispatcher("productDetails.jsp");
			rd.forward(request, response);	
		} catch (ClassNotFoundException | SQLException |NullPointerException e ) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			RequestDispatcher rd=request.getRequestDispatcher("noProduct.jsp");
			rd.forward(request, response);	
		} 
			}
}/*	try {
		
				psi.searchData(p);
				System.out.println(p);
				System.out.println("im in controller");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				System.out.print("INSIDE TRY");
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println("SQLEZCE");
				e.printStackTrace();
			}
*/	

		
		
		
		
        

