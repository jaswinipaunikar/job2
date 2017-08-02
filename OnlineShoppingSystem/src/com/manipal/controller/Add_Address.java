package com.manipal.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.manipal.DAO.jdbc.AddressImp;
import com.manipal.model.Address;
import com.manipal.service.impl.CustomerServiceImp;

/**
 * Servlet implementation class Add_Address
 */
@WebServlet("/Add_Address")
public class Add_Address extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String address=request.getParameter("address");
		String city=request.getParameter("city");
		String state=request.getParameter("state");
		String country=request.getParameter("country");
		String zip=request.getParameter("zipcode");
		AddressImp user = new AddressImp();
		try{
			Address add =new Address(address,city,state,country,zip);
			int adds=user.insertAddress(add);
			System.out.println("return:"+adds);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			
		}
	}

}
