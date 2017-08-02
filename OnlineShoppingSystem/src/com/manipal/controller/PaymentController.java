package com.manipal.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.manipal.DAO.CartDAO;
import com.manipal.DAO.jdbc.AddCartDAOImp;
import com.manipal.model.Payment;
import com.manipal.model.Product;
import com.manipal.model.Cart;
import com.manipal.service.PaymentService;
import com.manipal.service.impl.PaymentServiceImpl;
/**
 * Servlet implementation class PaymentController
 */
@WebServlet("/PaymentController")
public class PaymentController extends HttpServlet {
private PaymentService paymentService;
	
	public void init(ServletConfig config) throws ServletException {
		paymentService = new PaymentServiceImpl();
	}
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession(false);
	//	List <Product> li=(List<Product>) session.getAttribute("cart");
		//Payment pay = (Payment) session.getAttribute("cart");
			//List noOfSeats = (String) session.getAttribute("cart");
			//Dummy dummy = (Dummy) session.getAttribute("dummy");
			
			AddCartDAOImp a=new AddCartDAOImp();
			List<Product> productList = (List<Product>) session.getAttribute("cart");
			Float amount1 = (Float)session.getAttribute("totalnum");
			String amount = String.valueOf(amount1);
			String cid=(String)session.getAttribute("cardId");
			for (Product product : productList) 
			{
					Cart c=new Cart(cid,product.getProduct_Id(),amount);
					 int ad=0;
					try {
						ad = a.insertData(c);
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					 System.out.println("added into cart"+ad);
					
					
			}
			
			
			
			
		
				String cardNumber =request.getParameter("cardNumber");
				String expiry = request.getParameter("expiryMonth")+"-"+request.getParameter("expiryYear");
				String cvv = request.getParameter("cvvCode");
				
				
				//String paymentMessage = paymentService.validateAccount(cardNumber,expiry,cvv,amount);
				String paymentMessage = "Payment Done Successfully";
				if(paymentMessage.equals("Payment Done Successfully"))
				{
					
					request.setAttribute("Message", paymentMessage);
					request.setAttribute("totalnum", amount);
					RequestDispatcher rd=request.getRequestDispatcher("Bill.jsp");
					rd.forward(request, response);
				}
				else
				{
					request.setAttribute("Message", paymentMessage);
					RequestDispatcher rd=request.getRequestDispatcher("Bill.jsp");
					rd.forward(request, response);
				}
		
	}
}
