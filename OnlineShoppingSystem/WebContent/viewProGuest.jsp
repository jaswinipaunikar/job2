<%@page import="com.manipal.service.impl.ProductServiceImp"%>
<%@page import="com.manipal.service.impl.ProductServiceImp"%>
<%@page import="com.manipal.model.Product"%>
<%@page import="com.manipal.service.ProductService"%>
<%@page import="java.util.List"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View Product</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<header id="header"><!--header-->
		<div class="header-middle"><!--header-middle-->
			<div class="container">
				<div class="row">
					<div class="col-sm-4">
						<div class="logo pull-left">
							<a href="Admin.jsp"><img src="images/home/logo.png" alt="" /></a>
						</div>
							</div>
					<div class="col-sm-8">
						<div class="shop-menu pull-right">
							<ul class="nav navbar-nav">
								
								
								<li><a href="LogoutControllerr"><i class="fa fa-lock"></i> Logout</a></li>
							</ul>
						</div>
					</div>
				</div>
			</div>
		</div><!--/header-middle-->

	<div class="container">
		
		<h2>Product</h2>
		<div class="table-responsive">
			<table class="table">
						<tbody>
<%


ProductService p=new ProductServiceImp();
List<Product> vr=p.viewDatas();
for(Product var:vr)
{
	%>
	<tr>
	<td><form action="AddToCartController" method="post">
	
							<p><span style="color: #3366ff;">
							<%=var.getProduct_Id() %>
							<br/>
							</span>
							<span style="color: #808080;">
							<input type="hidden" name="productId" value="<%=var.getProduct_Id()%>"/>
			
							<br/>
							</span>
							<span style="color: #808080;">
							<%=var.getProduct_Name() %>
							<br/>
	
	
							</span>
							<span style="color: #808080;">
							<%=var.getDesc() %>
							<br/>
							</span>
							<span style="color: #808080;">
							<%=var.getPrice() %>
							<br/>
							</span>
							<span style="color: #808080;">
							
							
							<%-- <img src="http://localhost:8081/OnlineShoppingSystem/DisplayBlobController?s=<%=var.getProduct_Id() %>" height="100px" width="100px">
	 --%>
							<img src="http://52.15.195.85:8080/OnlineShoppingSystem/DisplayBlobController?s=<%=var.getProduct_Id() %>" height="100px" width="100px">
							
							 
							 
							 <br/>
							</span></p>		
						
	
									
									
									
									</td>		</tr>
	 <%
 }
 %>
 	
									
								
								
</tbody>
			</table>
			
			<h4> To shop for these products Login or sign up .</h4><a href="login.jsp"><b><i>LOGIN</i></b></a>
		</div>
		
		
	</div>
	
</body>
</html>