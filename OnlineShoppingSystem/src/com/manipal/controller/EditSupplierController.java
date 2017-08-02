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

import com.manipal.DAO.SupplierDAO;
import com.manipal.model.Address;
import com.manipal.model.Supplier;
import com.manipal.service.impl.SupplierServiceImp;
import com.manipal.service.impl.LoginServiceImpl;


/**
 * Servlet implementation class LoginController1
 */
@WebServlet("/EditSupplierController")
public class EditSupplierController extends HttpServlet {
	
	
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String supplier_Id = request.getParameter("supid");
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
		
		
		/*System.out.println(cat_name);
		System.out.println(des_name);*/
		Address a =new Address(address,address_City,address_State,address_Country,address_Zipcode);
		Supplier c =new Supplier(supplier_Id, supplier_Name, supplier_Username, supplier_Password,
				 supplier_Contact, supplier_Email);
		SupplierServiceImp cat = new SupplierServiceImp();
		
		
				
				
					 int status = 0;
					try {
						status = cat.updateData( c,a);
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				if(status!=0){
					System.out.println("data updated");
				}
				else{
					System.out.println("data not updated");
	}

}
}
