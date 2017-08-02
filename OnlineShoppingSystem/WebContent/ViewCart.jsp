<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.util.*"%>
    <%@page import="com.manipal.model.*"%>
    <%@page import="com.manipal.service.*"%>
    <%@page import="com.manipal.service.impl.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View Cart</title>
</head>
<body>

 <!--  <form method="post" action="EmployeeViewController">
<input type="submit" value="View"> -->
 <h2>VIEW CART</h2>
					<table>

<table border=1>
 <tr>
<td>CART_ID</td>
<td>CUSTOMER_ID</td>
<td>QUANTITY_IN_CART</td>
<td>PRODUCT_ID</td>
<td>Product_name</td>
<td>Product Price</td>
<td>Description</td>
</tr>
<%
	CartService view=new CartServiceImp();
	List<Cart> list=view.viewDatas();
	CartService view1=new CartServiceImp();
	List<Product> list1=view1.viewDatas1();
	for(Cart cal:list){
		%>
		<tr>
		<td><%=cal.getCart_Id()%></td>
		<%-- <td><%=cal.getCustomer_Id()%></td>
		<td><%=cal.getQuantity_In_Cart()%></td>
		 --%><% 
		for(Product pro:list1){
			/* if(cal.getProduct_Id()==pro.getProduct_Id()) */
			{%>
				<td><%=pro.getProduct_Id()%></td>
					<td><%=pro.getProduct_Name()%></td>
	
				<td><%=pro.getPrice()%></td>
				<td><%=pro.getDesc()%></td>
				
	<%}
			}
%> 

</tr>
<%} %>

</table>


</body>
</html>