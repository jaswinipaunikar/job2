
<%@page import="com.manipal.model.*"%>
<%@page import="com.manipal.service.impl.CategoryServiceImp"%>
<%! Category cat=null; %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta  http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Delete Cab Details</title>
</head>

<body>

<%     
	String cat_Id = request.getParameter("x");
int xx=0;
System.out.println(cat_Id);
	CategoryServiceImp cts = new CategoryServiceImp();
	xx = cts.categoryDeleteDetails(cat_Id);
	
 %>


<h1>Delete Category</h1>
<form method="post" action="DeleteCategoryController">
 Cat ID : <input type="text" name="c_id"  value="<%=cat.getCategory_Id()%>"required pattern="\d*[0-9]" maxlength="5"><br/>
<br/>
<br/>
<br/>
<input type="submit" value="Delete Cab">
<input type="reset" value="Cancel">

</form>
</body>

</html>