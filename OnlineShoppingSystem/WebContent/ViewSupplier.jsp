<%@page import="com.manipal.service.impl.*"%>
<%@page import="com.manipal.model.Customer"%>
<%@page import="com.manipal.model.Address"%>
<%@page import="com.manipal.model.*"%>
<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 5 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">	

<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
    <title>ViewSupplier | Shoptos</title>
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
    
<style>
#customers {
    font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
    border-collapse: collapse;
    width: 100%;
}

#customers td, #customers th {
    border: 1px solid #ddd;
    padding: 8px;
}

#customers tr:nth-child(even){background-color: #f2f2f2;}

#customers tr:hover {background-color: #ddd;}

#customers th {
    padding-top: 12px;
    padding-bottom: 12px;
    text-align: left;
    background-color: #4CAF50;
    color: white;
}
</style>
    
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
<h1>
admin page</h1>

<table id="customers">
	<b>CUSTOMER TABLE INFORMATION</b><br><br>
	<tr>
		
		<th>SupplierID</th>
		<th>Name</th>
		<th>Username</th>
		
		<th>contact</th>
		<!--  <th>Status</th> -->
		
		<!-- <th>Address</th>
		<th>city</th>
		<th>State</th>
		<th>Country</th>
		<th>Zipcode</th> -->
	</tr>
	
 
<%
SupplierServiceImp v=new SupplierServiceImp();
List<Supplier> vr=v.viewData();

for(Supplier var:vr)
{
	%>
		<tr>
		<td><%out.println(var.getSupplier_Id());%></td>
		<td><%out.println(var.getSupplier_Name());%></td>
		<td><%out.println(var.getSupplier_Username());%></td>
		<%-- <td><%=var.getSupplier_Password()%></td> --%>
		 <td><%out.println(var.getSupplier_Contact());%></td> 
		<%-- <td><%=var.getSupplier_Email()%></td> --%>
		<%-- <td><%=var.getSupplier_Address_Id()%></td>
	 --%>
	<%-- <td><%out.println(var.getStatus());%></td> --%>

<%}%> 

	
<%-- 
<%        
         CustomerServiceImp cp =new CustomerServiceImp();
         List<Address> gt=cp.retrieveAddressDatas();
        for(Address re:gt)
        {%><tr>
        	<td>
        	<%out.println(re.getAddress());%>
    		</td>
    		<td>
        	<%out.println(re.getCity());%>
    		</td>
    		<td>
        	<%out.println(re.getState());%>
    		</td>
    		<td>
        	<%out.println(re.getCountry());%>
    		</td>
    		<td>
        	<%out.println(re.getZipcode());%>
    		</td>
    		
    		
        
        <% } %> --%>
        
        </tr>
        
        
        
        
        
         
</table><br>
	
	
	
	
<footer id="footer"><!--Footer-->
		<div class="footer-top">
			<div class="container">
				<div class="row">
					<div class="col-sm-2">
						<div class="companyinfo">
							<h2>Shoptos</h2>
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
								
							</ul>
						</div>
					</div>
					
					
					
				</div>
			</div>
		</div>
		
		<div class="footer-bottom">
			<div class="container">
				<div class="row">
					<p class="pull-left">Copyright � 2017 Shoptos. All rights reserved.</p>
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