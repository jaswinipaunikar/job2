package com.manipal.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.manipal.model.Product;
import com.manipal.service.impl.ProductServiceImp;


@WebServlet("/EditProductController")
public class EditProductController extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String product_Id=request.getParameter("pdtid");    
        
		String product_Name=request.getParameter("pdtname");    
        String product_Image=request.getParameter("fileupload");    
        //String price=request.getParameter("price");
        Double price=Double.parseDouble(request.getParameter("price"));
        String description=request.getParameter("description");
        System.out.println(product_Name);
		System.out.println(description);
		
		Product p =new Product(product_Id,product_Name, description,price);
		ProductServiceImp cat = new ProductServiceImp();
		
		
				
				
					 int status = 0;
					try {
						status = cat.updateDatas( p);
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				if(status!=0){
					System.out.println("data updated");
					RequestDispatcher rd=request.getRequestDispatcher("viewProductA.jsp");
					rd.forward(request, response);
				}
				else{
					System.out.println("data not updated");
					RequestDispatcher rd=request.getRequestDispatcher("viewProductA.jsp");
					rd.forward(request, response);
	}

}
}
