package com.manipal.controller;

import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import com.manipal.DAO.ProductDAO;
import com.manipal.DAO.jdbc.JdbcProductDAOImpl;
import com.manipal.model.Product;
import com.manipal.service.impl.ProductServiceImp;

@WebServlet("/AddProductController")
@MultipartConfig(maxFileSize=16177215)

/*@MultipartConfig(fileSizeThreshold=1024*1024*10, 	// 10 MB 
maxFileSize=1024*1024*50,      	// 50 MB
maxRequestSize=1024*1024*100)
*/
public class AddProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private int status;
       
    public AddProductController() {
        super();
    
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	String product_Name=request.getParameter("pdtname");    
    	System.out.println(product_Name);
        Part filePart=request.getPart("pdtimage");
        		InputStream photo=filePart.getInputStream();
    	//String product_Image=request.getParameter("pdtimage");    
        //String price=request.getParameter("price");
        Double price=Double.parseDouble(request.getParameter("price"));
        String description=request.getParameter("description");
        String category_name=request.getParameter("category_name");
        String supplier_name=request.getParameter("supplier_name");
        System.out.println(category_name+"  "+ supplier_name);
        ProductServiceImp productservice = new ProductServiceImp();
		
		
				
				
					 int status = 0;
					try {
						status = productservice.insertDatas(product_Name,photo,price,description,category_name,supplier_name);
						HttpSession session=request.getSession();
						
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						System.out.println("oopsie");
						e.printStackTrace();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						System.out.println("sqlproblem");
						e.printStackTrace();
					}
				if(status!=0){
					System.out.println("data inserted");
					RequestDispatcher rd=request.getRequestDispatcher("viewProductA.jsp");
					rd.forward(request, response);
				}
				else{
					System.out.println("data not inserted");
				
					System.out.println("invalid");
					RequestDispatcher rd=request.getRequestDispatcher("viewProductA.jsp");
					rd.forward(request, response);
				}
				
				RequestDispatcher rd=request.getRequestDispatcher("viewProductA.jsp");
				rd.forward(request, response);
    
    }

    
}
