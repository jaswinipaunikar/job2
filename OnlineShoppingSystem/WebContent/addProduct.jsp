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
    <title>Add Product | Shoptos</title>
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
							<a href="LogoutControllerr"><img src="images/home/logo.png" alt="" /></a>
						</div>
							</div>
					<div class="col-sm-8">
						<div class="shop-menu pull-right">
							<ul class="nav navbar-nav">
							
							<li><a href="LogoutControllerr" class="active"><i class="fa fa-lock"></i> Logout</a></li>
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
								<li><a href="Admin.jsp" class="active">Home</a></li>
								<li class="dropdown"><a href="#">Product<i class="fa fa-angle-down"></i></a>
                                    <ul role="menu" class="sub-menu">
                                        <li><a href="addProduct.jsp">Add Product</a></li>
										<li><a href="editProduct.jsp">Edit Product</a></li> 
										<li><a href="deleteProduct.jsp">Delete Product</a></li> 
										<li><a href="viewProductA.jsp">View Product</a></li> 
										   </ul>
                                </li>
								<li class="dropdown"><a href="#">Category<i class="fa fa-angle-down"></i></a>
                                    <ul role="menu" class="sub-menu">
                                        <li><a href="AddCategory.jsp">Add Category</a></li>
										
										<li><a href="ViewCategory.jsp">View Category</a></li> 
										   </ul>
                                </li>
								
										<li class="dropdown"><a href="#">Customer<i class="fa fa-angle-down"></i></a>
                                    <ul role="menu" class="sub-menu">
                                       <!--  <li><a href="addCustomer.jsp">Add Customer</a></li> -->
										<!-- <li><a href="EditCustomer.jsp">Edit Customer</a></li> --> 
										<li><a href="DeltCustomer.jsp">Delete Customer</a></li> 
										<li><a href="ViewCustomer.jsp">View Customer</a></li> 
										   </ul>
                                </li> 
								
										
						
								<li class="dropdown"><a href="#">Supplier<i class="fa fa-angle-down"></i></a>
                                    <ul role="menu" class="sub-menu">
                                        <li><a href="AddSupplier.jsp">Add Supplier</a></li>
										
										<!-- <li><a href="Delete_Supplier.jsp">Delete Supplier</a></li> --> 
										<li><a href="ViewSupplier.jsp">View Supplier</a></li> 
										   </ul>
                                </li> 
								
								<li class="dropdown"><a href="#">Employee<i class="fa fa-angle-down"></i></a>
                                    <ul role="menu" class="sub-menu">
                                        <li><a href="Register_Employee.jsp">Add Employee</a></li>
										
										
										 <li><a href="Delete_Employee.jsp">Delete Employee</a></li> 
										<li><a href="ViewEmployee.jsp">View Employee</a></li> 
										   </ul>
                                </li> 
						
								
								<li><a href="contact-us.jsp">Contact</a></li>
							</ul>
						</div>
					</div>
					<div class="col-sm-3">
						<div class="search_box pull-right">
											<form action="productDetails.jsp" METHOD="POST" >
							<input type="text" name="pdtname" placeholder="Search"/>
						</form>
		
						</div>
					</div>
				</div>
			</div>
		</div><!--/header-bottom-->
</header><!--/header-->

	<section id="form"><!--form-->
		<div class="container">
			<div class="row">
				<div class="col-sm-4 col-sm-offset-1">
					<div class="login-form"><!--add product form-->
						<h2>Add Product</h2>
						<form action="AddProductController" method="post" enctype="multipart/form-data">
							<input type="text" name="pdtname" required placeholder="Product Name"  required pattern="(*[A-Za-z])" title="Please enter valid product name" maxlength="100" required />
							<!-- <input type="text" name="quantity" placeholder="Quantity" />
							 -->
							 <input type="file" name="pdtimage" value="fileupload" id="fileupload">
							
							<input type="text" name="price" required placeholder="Price" required pattern="(*[0-9]]{4})" title ="please enter valid price" maxlength="100"  required/>
						
						
							<label for="sell2">Select Category:</label>						
							<select class="form-control" name="category_name"  onclick="ViewCategoryController" required>
						    <option value="">Select Category</option>
						    
						    
						    <table class="table">

	
<%

CategoryService v=new CategoryServiceImp();
List<Category> vr=v.viewDatas();
for(Category var:vr)
{
	%>
	<tr>
					
							
					
							<td><option value><%=var.getCategory_Name() %></td>
							
							
						
					</tr>
	 <%
 }
 %>
</tbody>
			</table>
		</div>
	</div>
						   
						<%-- 	<option><%= %></option> --%>
							</select>
						
							<label for="sell2">Select Supplier:</label>					
								
							<select class="form-control" name="supplier_name" required>
						    <option value="">Select Supplier</option>
						    <option value="kajaria">Kajaria</option>
							<option value="tisca">Tisca</option>
							<option value="godrej">Godrej</option>
							
							<%-- <% %> --%>
							</select>
							
							
							<textarea name="description" placeholder="Description" rows="10" cols="30"  required pattern="(.,\d*[A-Za-z])" title="please enter valid input" maxlength="100" ></textarea>
							<button type="submit" value="Add" class="btn btn-default">
							Add</button>
						</form>
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
		
		<div class="footer-widget">
			<div class="container">
				<div class="row">
					<div class="col-sm-2">
						<div class="single-widget">
							<h2>Service</h2>
							<ul class="nav nav-pills nav-stacked">
								<li><a href="">Contact Us</a></li>
								<li><a href="">FAQ</a></li>
							</ul>
						</div>
					</div>
					<div class="col-sm-2">
						<div class="single-widget">
							<h2>About Shoptos</h2>
							<ul class="nav nav-pills nav-stacked">
								<li><a href="">Company Information</a></li>
								<li><a href="">Copyright</a></li>
							</ul>
						</div>
					</div>
					<div class="col-sm-3 col-sm-offset-1">
						<div class="single-widget">
							<h2>About Shoptos</h2>
							<form action="#" class="searchform">
								<input type="text" placeholder="Your email address" />
								<button type="submit" class="btn btn-default"><i class="fa fa-arrow-circle-o-right"></i></button>
								<p>Get the most recent updates from <br />our site and be updated your self...</p>
							</form>
						</div>
					</div>
					
				</div>
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