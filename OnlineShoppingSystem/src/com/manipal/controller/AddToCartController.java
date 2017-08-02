package com.manipal.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import oracle.net.aso.p;

import com.manipal.model.Cart;
import com.manipal.model.Product;
import com.manipal.service.CartService;
import com.manipal.service.ProductService;
import com.manipal.service.impl.CartServiceImp;
import com.manipal.service.impl.ProductServiceImp;
import com.manipal.util.GenerateCartId;


/**
 * Servlet implementation class AddToCartController
 */
/*
@WebServlet("/AddToCartController")
public class AddToCartController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     
    public AddToCartController() {
        super();
        // TODO Auto-generated constructor stub
    }

	*//**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 *//*
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String productId=request.getParameter("productId");
		System.out.println("productId from jsp "+productId);
		
		ProductService pa=new ProductServiceImp();
		Product ps=pa.getPros(productId);
		
		List<Product> pList=new ArrayList<Product>();
		HttpSession session=request.getSession();

		if(session.getAttribute("cart")!=null){
			pList=(List<Product>)session.getAttribute("cart");
		
			for (Product pid :(ArrayList<Product>)session.getAttribute("cart")) {
				pList.add(pid);
			}
			pList.add(ps);
			
			session.setAttribute("cart", pList);
			
		}else{
			
			pList.add(ps);
			session.setAttribute("cart", pList);
		}
		for (Product integer : pList) {
			System.out.println(integer);
		}
		for (Product product : ((ArrayList<Product>)session.getAttribute("cart"))) {
			System.out.println(product.getProduct_Name());
		}
		
		//response.sendRedirect("viewProduct.jsp");
	}

}
*/

		

		
		@WebServlet("/AddToCartController")
		public class AddToCartController extends HttpServlet {
			private static final long serialVersionUID = 1L;
		       
		    public AddToCartController() {
		        super();
		        
		    }

			protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
			{
				
				
			String productId= request.getParameter("productId");
				   System.out.println(productId);

			       
			     
				   ProductServiceImp psi= new ProductServiceImp();
				         
				   Product p;
				try {
					p = psi.getPros(productId);
				
				   List<Product> list=new ArrayList<Product>(); 
			       HttpSession s = request.getSession();

			       if(s.getAttribute("cart")!=null){
						for (Product products : (ArrayList<Product>)s.getAttribute("cart")) {
							list.add(products);
						}
						list.add(p);
						s.setAttribute("cart", list);
					}else{
						list.add(p);
						s.setAttribute("cart", list);
						s.setAttribute("cartId", GenerateCartId.cartId());
					}
					for (Product productItem : (ArrayList<Product>)s.getAttribute("cart")) {
						System.out.println(productItem.getProduct_Name());
						//System.out.println(productItem.getProductQuantity());
					}
					response.sendRedirect("viewProduct.jsp");

				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}                 
				
			}

		}
