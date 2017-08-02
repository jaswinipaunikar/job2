package com.manipal.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.annotation.WebServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.manipal.DAO.SupplierDAO;
import com.manipal.DAO.suppDAO;
import com.manipal.model.Address;
import com.manipal.model.Supplier;
import com.manipal.service.impl.SupplierServiceImp;




@WebServlet("/SupplierController")
public class SupplierController extends HttpServlet {
	
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//String supplier_Id = request.getParameter("supid");
		String supplier_Name = request.getParameter("supname");
		String supplier_Username= request.getParameter("supuser");
		String supplier_Password = request.getParameter("suppass");
		String supplier_Contact = request.getParameter("supcontact");
		String supplier_Email = request.getParameter("supemail");
		String address = request.getParameter("add");
		String address_City = request.getParameter("city");
		String address_State = request.getParameter("state");
		String address_Country = request.getParameter("country");
		String address_Zipcode = request.getParameter("zcode");
		
		
	
		Address a =new Address(address,address_City,address_State,address_Country,address_Zipcode);
		Supplier c =new Supplier(supplier_Name, supplier_Username, supplier_Password,
				 supplier_Contact, supplier_Email);
		
		SupplierServiceImp regImp=new SupplierServiceImp();
		
		
				
				
					 int i= 0;
					try {
						i = regImp.insertDatas(c,a);
						
						
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				if(i!=0){
					System.out.println("data inserted");
					RequestDispatcher rd=request.getRequestDispatcher("Admin.jsp");
					rd.forward(request, response);
				}
				else{
					System.out.println("data not inserted");
					RequestDispatcher rd=request.getRequestDispatcher("Add_Supplier.jsp");
					rd.forward(request, response);
				
					
					System.out.println("invalid");
				}
				
				
	}
}
