
<%@page import="com.manipal.model.*"%>
<%@page import="com.manipal.service.impl.CategoryServiceImp"%>
<%! Category c=null; %>
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
							<a href="admin.jsp"><img src="images/home/logo.png" alt="" /></a>
						</div>
							</div>
					<div class="col-sm-8">
						<div class="shop-menu pull-right">
							<ul class="nav navbar-nav">
								<li><a href="#"><i class="fa fa-user"></i> Account</a></li>
								<li><a href="checkout.html"><i class="fa fa-crosshairs"></i> Checkout</a></li>
								<li><a href="cart.html"><i class="fa fa-shopping-cart"></i> Cart</a></li>
								<li><a href="login.html"><i class="fa fa-lock"></i> Logout</a></li>
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
										<li><a href="EditCategory.jsp">Edit Category</a></li> 
										<li><a href="Delete_Category.jsp">Delete Category</a></li> 
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
										<li><a href="EditSupplier.jsp">Edit Supplier</a></li> 
										<li><a href="Delete_Supplier.jsp">Delete Supplier</a></li> 
										<li><a href="ViewSupplier.jsp">View Supplier</a></li> 
										   </ul>
                                </li> 
								
								<li class="dropdown"><a href="#">Employee<i class="fa fa-angle-down"></i></a>
                                    <ul role="menu" class="sub-menu">
                                        <li><a href="Register_Employee.jsp">Add Employee</a></li>
										
										<!-- <li><a href="Employee.jsp">Edit Employee</a></li> 
										 -->
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

	<%     
	String cat_Id = request.getParameter("x");
	c=new Category();
	CategoryServiceImp cts = new CategoryServiceImp();
	int cat = cts.categoryDeleteDetails(cat_Id);
	
 %>
	
	<section id="form"><!--form-->
		<div class="container">
			<div class="row">
				<div class="col-sm-4 col-sm-offset-1">
					<div class="product-form"><!--add product form-->
						<h1>Delete Category</h1>
							<form method="post" action="DeleteCategoryController">
 								Category ID : <input type="text" readonly name="c_id" value="<%=cat_Id%>" required pattern="\d*[0-9]" maxlength="5"><br/>
 								
									<br/>
									<br/>
									<br/>
									<input type="submit" value="Delete">
									

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
								<li><a href="">FAQ’s</a></li>
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
					<p class="pull-right">Designed by <span><a target="_blank" href="http://www.themeum.com">Themeum</a></span></p>
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