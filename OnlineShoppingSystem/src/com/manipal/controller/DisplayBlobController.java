package com.manipal.controller;

import java.io.IOException;
import java.io.OutputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DisplayBlobController
 */
@WebServlet("/DisplayBlobController")
public class DisplayBlobController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DisplayBlobController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Blob image = null;

		Connection con = null;

		byte[ ] imgData = null ;

		PreparedStatement stmt = null;

		ResultSet rs = null;

		try {

			
		Class.forName("com.mysql.jdbc.Driver");

		con = DriverManager.getConnection("jdbc:mysql://13.58.160.87:3306/oss","root","root");
		//con = DriverManager.getConnection("jdbc:mysql://localhost/oss","root","root");
		Long a=Long.parseLong(request.getParameter("s"));
		//out.println(a);
		stmt = con.prepareStatement("select product_image from Product where product_id=?");
		stmt.setLong(1,a);


		rs = stmt.executeQuery();
		//out.println(rs);

		if (rs.next()) {

		image = rs.getBlob(1);

		imgData = image.getBytes(1,(int)image.length());

		} else {

		//out.println("Display Blob Example");

		//out.println("image not found for given id>");

		return;

		}

		// display the image

		response.setContentType("image/gif");

		OutputStream o = response.getOutputStream();

		o.write(imgData);

		o.flush();

		o.close();

		} catch (Exception e) {

		//out.println("Unable To Display image");

		//out.println("Image Display Error=" + e.getMessage());

		return;

		} finally {

		try {

		//rs.close();

		stmt.close();

		con.close();

		} catch (SQLException e) {

		e.printStackTrace();

		}

		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
