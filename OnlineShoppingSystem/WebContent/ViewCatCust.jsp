<%@page import="com.manipal.service.impl.CategoryServiceImp"%>
<%@page import="com.manipal.model.Category"%>
<%@page import="com.manipal.service.CategoryService"%>
<%@page import="com.manipal.DAO.jdbc.CategoryDaoImp"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 5 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">	

<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
    <title> View Category | Shoptos</title>
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/font-awesome.min.css" rel="stylesheet">
    <link href="css/prettyPhoto.css" rel="stylesheet">
    <link href="css/price-range.css" rel="stylesheet">
    <link href="css/animate.css" rel="stylesheet">
	<link href="css/main.css" rel="stylesheet">
	<link href="css/responsive.css" rel="stylesheet">
    <!--[if lt IE 9]>
    <script src="js/html5shiv.js"></script>
    <script src="js/respond.min.js"></script>
    <![endif]-->       
    <link rel="shortcut icon" href="images/ico/favicon.ico">
    <link rel="apple-touch-icon-precomposed" sizes="144x144" href="images/ico/apple-touch-icon-144-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="114x114" href="images/ico/apple-touch-icon-114-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="72x72" href="images/ico/apple-touch-icon-72-precomposed.png">
    <link rel="apple-touch-icon-precomposed" href="images/ico/apple-touch-icon-57-precomposed.png">
</head><!--/head-->

<body>
	<header id="header"><!--header-->
	
		<div class="header-middle"><!--header-middle-->
			<div class="container">
				<div class="row">
					<div class="col-sm-4">
						<div class="logo pull-left">
							<a href="cust_home.jsp"><img src="images/home/logo.png" alt="" /></a>
						</div>
							</div>
					<div class="col-sm-8">
						<div class="shop-menu pull-right">
							<ul class="nav navbar-nav">
								<li><a href="#"><i class="fa fa-user"></i> <% String username=(String)session.getAttribute("custUserName1");
								out.print(username);%></a></li>

								<li><a href="login.jsp"><i class="fa fa-lock"></i> Logout</a></li>
							</ul>
						</div>
					</div>
				</div>
			</div>
		</div><!--/header-middle-->
	
		<div class="header-bottom"><!--header-bottom-->
			<div class="container">
				<div class="row">
					<div class="col-sm-9">
						<div class="navbar-header">
							<button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
								<span class="sr-only">Toggle navigation</span>
								<span class="icon-bar"></span>
								<span class="icon-bar"></span>
								<span class="icon-bar"></span>
							</button>
						</div>
						<div class="mainmenu pull-left">
							<ul class="nav navbar-nav collapse navbar-collapse">
								
							
								<li><a href="cust_home.jsp">Home</a></li>
								
								
								<li><a href="contact-us.jsp">Contact</a></li>
							</ul>
						</div>
					</div>
					<div class="col-sm-3">
						<div class="col-sm-3">
						<div class="search_box pull-right">
						<!-- <form action="productDetailsc.jsp" METHOD="POST" >
							<input type="text" name="pdtname" placeholder="Search"/>
						</form> -->
						
						</div>
					</div>
				</div>
			</div>
		</div><!--/header-bottom-->
	</header><!--/header-->

	<section id="form"><!--form-->
		<div class="container">
			<div class="row">
					<div class="product-form"><!--add product form-->
						<h2>View Category</h2>
						
						<div class="container">
		<h2>Category</h2>
					<table class="table">
<tr>
	<th>Category Id</th>
	<th>Category Name</th>
	<th>Category Description</th>
	<!-- <th>Status</th> -->
	<!-- <th>Update</th>
	<th>Delete</th>
	 -->
</tr>
	
<%

CategoryService v=new CategoryServiceImp();
List<Category> vr=v.viewDatas();
for(Category var:vr)
{
	%>
	<tr>
						<td><%=var.getCategory_Id() %></td>
							
					
							<td><%=var.getCategory_Name() %></td>
							
							<td><%=var.getDescription() %></td>
							<%-- <td><%=var.getStatus() %></td>
 --%>							<%-- <td><a href="EditCategory.jsp?x=<%=var.getCategory_Id()%>">Update</a></td>
							<td><a href="Delete_Category.jsp?x=<%=var.getCategory_Id()%>">Delete</a></td> --%>
							
							
						
					</tr>
	 <%
 }
 %>
</tbody>
			</table>
		</div>
	</div>
						
						<!-- <form action="#">
							<input type="text" name="pdtname" placeholder="Product Name" />
							<input type="text" name="quantity" placeholder="Quantity" />
							<input type="text" name="price" placeholder="Price" />
							<textarea name="description" placeholder="Description" rows="10" cols="30" ></textarea>
							<button type="submit" value="Add" class="btn btn-default">
							Add</button>
						</form> -->
					</div><!--/add product form-->
				
			</div>
				</div>
			</div>
		</div>
	</section><!--/form-->
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	<footer id="footer"><!--Footer-->
		<div class="footer-top">
			<div class="container">
				<div class="row">
					<div class="col-sm-2">
						<div class="companyinfo">
							<h2><span>e</span>-Shoptos</h2>
							<p>Have the best shopping experience here</p>
						</div>
					</div>
					<div class="col-sm-7">
						<div class="col-sm-3">
						
			</div>
		</div>
		
		
		<div class="footer-bottom">
			<div class="container">
				<div class="row">
					<p class="pull-left">Copyright © 2017 Shoptos. All rights reserved.</p>
						</div>
			</div>
		</div>
		
	</footer><!--/Footer-->
	

  
    <script src="js/jquery.js"></script>
	<script src="js/price-range.js"></script>
    <script src="js/jquery.scrollUp.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
    <script src="js/jquery.prettyPhoto.js"></script>
    <script src="js/main.js"></script>
</body>
</html>