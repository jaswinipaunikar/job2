package com.manipal.controller;

import java.io.IOException;

import java.util.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.manipal.model.Product;

@WebServlet("/RemoveFromCart")
public class RemoveFromCart extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public RemoveFromCart() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String productId=request.getParameter("prodid");
		
		HttpSession removeSession=request.getSession();
		List <Product> productList=(ArrayList<Product>)removeSession.getAttribute("cart");
		for (int i=0;i<productList.size();i++) {
			
			if(productList.get(i).getProduct_Id().equals(productId)){
				productList.remove(i);
			}
		}
		HttpSession session=request.getSession();
		if(((ArrayList<Product>)session.getAttribute("cart")).size()>0){
			session.setAttribute("msg", "Product Removed Successfully!");
			System.out.println("success");
		}else{
			session.setAttribute("msg", "Cart Empty Add Some Product!");
			System.out.println("cart empty");
		}
		response.sendRedirect("Remove_cart.jsp");
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
