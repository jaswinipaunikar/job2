<%@page import="com.manipal.model.Address"%>
<%@page import="com.manipal.model.Customer"%>
<%@page import="com.manipal.service.impl.CustomerServiceImp"%>
<%@page import="com.manipal.service.impl.AddressServiceImp"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 5 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">	

<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
    <title>Edit Employee | Shoptos</title>
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
							<a href="index.html"><img src="images/home/logo.png" alt="" /></a>
						</div>
							</div>
					<div class="col-sm-8">
						<div class="shop-menu pull-right">
							<ul class="nav navbar-nav">
								<li><a href="#"><i class="fa fa-user"></i> Account</a></li>
								<li><a href="checkout.html"><i class="fa fa-crosshairs"></i> Checkout</a></li>
								<li><a href="cart.html"><i class="fa fa-shopping-cart"></i> Cart</a></li>
								<li><a href="login.html"><i class="fa fa-lock"></i>Login </a></li>
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
								<li><a href="index.html" class="active">Home</a></li>
								<li class="dropdown"><a href="#">Product<i class="fa fa-angle-down"></i></a>
                                    <ul role="menu" class="sub-menu">
                                        <li><a href="brush.jsp">BrushStand</a></li>
										<li><a href="editProduct.jsp">Mirrors</a></li> 
										<li><a href="deleteProduct.jsp">Bathroom Cabinets</a></li> 
										<li><a href="viewProduct.jsp">Furniture</a></li> 
										<li><a href="viewProduct.jsp">Plate Stand</a></li>
										<li><a href="viewProduct.jsp">Crocaries</a></li>
									 </ul>
                                </li>
								<li class="dropdown"><a href="#">Category<i class="fa fa-angle-down"></i></a>
                                    <ul role="menu" class="sub-menu">
                                        <li><a href="addCategory.jsp"></a>Home Decor</li>
										<li><a href="editCategory.jsp">Kitchen Accesssories</a></li> 
										<li><a href="deleteCategory.jsp">Bathroom Accessories</a></li> 
										<li><a href="viewCategory.jsp">Living</a></li> 
										   </ul>
                                </li>
								
							
						
								
								<li><a href="contact-us.jsp">Contact</a></li>
								<li><a href="#">Logout</a></li>
                                   
                                
							</ul>
						</div>
					</div>
					<div class="col-sm-3">
						<div class="search_box pull-right">
							<input type="text" placeholder="Search"/>
						</div>
					</div>
				</div>
			</div>
		</div><!--/header-bottom-->
</header><!--/header-->

<%
String id = request.getParameter("custUserName");
CustomerServiceImp obj = new CustomerServiceImp();
AddressServiceImp obj1=new AddressServiceImp();
Customer cust = obj.getCustomerDatas(id);
String ids=cust.getcustomer_Address_Id();
Address add=obj1.getAddressData(ids);

%>

<section id="form"><!--form-->
		<div class="container">
			<div class="row">
				<div class="col-sm-4">
					<div class="signup-form"><!--sign up form-->
						<h2>Eddit !</h2>
						<form action="CustomerEditController" method="post">
							<input type="text" placeholder="FirstName" value="<%=cust.getCustomer_First_Name() %>" name="frstnm"/ required pattern="[a-zA-Z][a-zA-Z\s]*" title="Please enter valid name">
							<input type="text" placeholder="LastName"  value="<%=cust.getCustomer_Last_Name() %>" name="lastnm"/ required pattern="[a-zA-Z][a-zA-Z\s]*" title="Please enter valid name">
							<!-- <input type="radio" name="gender" value="male" checked> Male<br>
  							<input type="radio" name="gender" value="female"> Female<br> -->
  							<!-- <input type="radio" name="gender" value="Male">
							<input type="radio" name="gender" value="Female">
							<input type="radio" name="gender" value="Other"> -->
							<label for="sel12">Select Gender:</label>
							<select name="gender" required>
    						<option value="None selected">Please select below</option>
    						<option value="Male">Male</option>
    						<option value="Female">Female</option>
							</select>
							<br>
							<br>
  							<input type="date" placeholder="dob" name="dob" value="<%=cust.getCustomer_DOB() %>"/><br>
							<input type="text" placeholder="PhoneNumber" value="<%=cust.getCustomer_Contact() %>" name="phone" required pattern="[0-9]{10}" title="Please Enter a Valid 10 Digit Phone Number" maxlength="10"/>
							<input type="email" placeholder="Email Address" value="<%=cust.getCustomer_Email() %>" name="email" required/>
							<input type="text" placeholder="address" name="address" value="<%=add.getAddress() %>" required/>
							<input type="text" placeholder="city" name="city" value="<%=add.getCity() %>" required/>
							<input type="text" placeholder="state" name="state" value="<%=add.getState() %>" required/>
							<%-- <label for="sel12">Select State:</label>
							
  							<select class="form-control states" name="state" id="sel12 stateId" required>
   							<option value="<%=cust.getStaffFirstName() %>">Select State</option>
   							<option value="maharshtra">Maharashtra</option>
							<option value="karnataka">Karnataka</option>
							<option value="gujrat">Gujarat</option>
							<option value="madhyapradesh">Madhyapradesh</option>
  							</select>
  							<br>
							 --%><input type="text" name="country" placeholder="Country" value="<%=add.getCountry() %>" required/> 
							<!-- <label for="sel12">Select Country:</label>
							<select class="form-control states" name="state" id="sel12 stateId" required>
   							<option value="">Select Country</option>
   							<option value="India">INDIA</option>
							<option value="Usa">USA</option>
  							</select>
							<br> -->
							
							<input type="text" placeholder="username" value="<%=cust.getCustomer_Username() %>" name="username" required pattern="[a-zA-Z][a-zA-Z0-9\s]*" title="Please enter valid username"/>
							
							<input type="text" placeholder="Password" value="<%=cust.getCustomer_Password() %>" name="password" required pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}" title="Must contain at least one number and one uppercase and lowercase letter, and at least 8 or more characters"/>
							
							<button type="submit" class="btn btn-default">Save Changes</button>
						</form>
					</div><!--/sign up form-->
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
							<h2><span>e</span>-shopper</h2>
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