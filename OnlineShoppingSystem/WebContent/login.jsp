<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
    <title>Login | Shoptos</title>
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
		<div class="header_top"><!--header_top-->
			<div class="container">
				<div class="row">
					<div class="col-sm-6">
						<div class="contactinfo">
							<ul class="nav nav-pills">
								
							</ul>
						</div>
					</div>
				</div>
			</div>
		</div><!--/header_top-->
		
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
								<li><a href=""><i class="fa fa-user"></i> Account</a></li>
								
							
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
								<!-- <li><a href="cust_home.jsp">Home</a></li>
								<li class="dropdown"><a href="#">Shop<i class="fa fa-angle-down"></i></a>
                                    <ul role="menu" class="sub-menu">
                                        <li><a href="viewProduct.jsp">Products</a></li>
										 
										 
                                    </ul>
                                </li>  -->
								
								<li><a href="contact-us.jsp">Contact</a></li>
								<li><a href="RegisterCustomer.jsp">Sign UP</a></li>
							</ul>
						</div>
					</div>
							<br>	
				
<% 
  String msg=(String)session.getAttribute("msg");
  if(msg!=null){
  out.println("<div class=\"alert alert-success\" role=\"alert\">"+msg+"</div>");
  session.removeAttribute("msg");
  }
  %>
				 
	
					<div class="col-sm-3">
						
					</div>
				</div>
			</div>
		</div><!--/header-bottom-->
	</header><!--/header-->
	
	<section id="form"><!--form-->
		<div class="container">
			<div class="row">
				<div class="col-sm-4 col-sm-offset-1">
					<div class="login-form"><!--login form-->
						<h2>Login to your account</h2>
						<form action="LoginController" method="post">
						
							<input type="text" placeholder="UserName" name="custUserName" required pattern="[a-zA-Z][a-zA-Z0-9\s]*" title="Please enter valid username"/>
							<input type="password" placeholder="Password" name="custPassword" required pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}" title="Must contain at least one number and one uppercase and lowercase letter, and at least 8 or more characters" />
							
							<button type="submit" class="btn btn-default">Login</button>
						</form>
					</div><!--/login form-->
				</div>
				<div class="col-sm-1">
				 
				 
				 
				 
				 
				 
				 
				 
				 
				 
				 
				<!-- 	<h2 class="or">OR</h2>
				</div>
				<div class="col-sm-4">
					<div class="signup-form">sign up form
						<h2>New User Signup!</h2>
						<form action="#">
							<input type="text" placeholder="FirstName" name="frstnm"/ required pattern="[a-zA-Z][a-zA-Z\s]*" title="Please enter valid name">
							<input type="text" placeholder="LastName" name="lastnm"/ required pattern="[a-zA-Z][a-zA-Z\s]*" title="Please enter valid name">
							<input type="radio" name="gender" value="male" checked> Male<br>
  							<input type="radio" name="gender" value="female"> Female<br>
  							<input type="radio" name="gender" value="Male">
							<input type="radio" name="gender" value="Female">
							<input type="radio" name="gender" value="Other">
							<label for="sel12">Select Gender:</label>
							<select name="Gender" required>
    						<option value="None selected">Please select below</option>
    						<option value="Male">Male</option>
    						<option value="Female">Female</option>
							</select>
							<br>
							<br>
  							<input type="date" placeholder="dob" name="dob"/><br>
							<input type="text" placeholder="PhoneNumber" name="phone" required pattern="[0-9]{10}" title="Please Enter a Valid 10 Digit Phone Number" maxlength="10"/>
							<input type="email" placeholder="Email Address" name="email" required/>
							<input type="text" placeholder="address" name="address" required/>
							<input type="text" placeholder="city" name="city" required/>
							<label for="sel12">Select State:</label>
							
  							<select class="form-control states" name="state" id="sel12 stateId" required>
   							<option value="">Select State</option>
   							<option value="maharshtra">Maharashtra</option>
							<option value="karnataka">Karnataka</option>
							<option value="gujrat">Gujarat</option>
							<option value="madhyapradesh">Madhyapradesh</option>
  							</select>
  							<br>
							<input type="text" name="country" placeholder="Country" />
							<label for="sel12">Select Country:</label>
							<select class="form-control states" name="state" id="sel12 stateId" required>
   							<option value="">Select Country</option>
   							<option value="India">INDIA</option>
							<option value="Usa">USA</option>
  							</select>
							<br>
							
							<input type="text" placeholder="username" name="username" required pattern="[a-zA-Z][a-zA-Z0-9\s]*" title="Please enter valid username"/>
							
							<input type="password" placeholder="Password" name="password" required pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}" title="Must contain at least one number and one uppercase and lowercase letter, and at least 8 or more characters"/>
							
							<button type="submit" class="btn btn-default">Signup</button>
						</form>
					</div>/sign up form -->
				</div>
			</div>
		</div>
	</section><!--/form-->
	
<!-- 	
		
			
		
	</footer>/Footer
	

   -->
    <script src="js/jquery.js"></script>
	<script src="js/price-range.js"></script>
    <script src="js/jquery.scrollUp.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
    <script src="js/jquery.prettyPhoto.js"></script>
    <script src="js/main.js"></script>
</body>
</html>