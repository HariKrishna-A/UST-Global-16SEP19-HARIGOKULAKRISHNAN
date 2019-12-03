<%@page import="com.ustglobal.rms.dto.ProductBean"%>
<%@page import="com.ustglobal.rms.dto.RetailerBean"%>
<%@page import="org.hibernate.Session"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%
	RetailerBean beans = (RetailerBean) session.getAttribute("bean");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<a href="./changepassword">Change Password</a>
	<a href="./logout" style="float: right;">Logout</a>
	<h2>
		Welcome
		<%=beans.getName()%>
	</h2>
	<fieldset>
		<legend>Search</legend>
		<form action="./search">
			<table>
 				<tr>
					<td>ID :</td>
					<td><input type="number" name="id"></td>
					<td><input type="submit" name="Search"></td>
				</tr>
			</table>
		</form>
	</fieldset>

	<%
	ProductBean productBean = (ProductBean) request.getAttribute("bean");
	%>

	<%
		if (productBean != null) {
	%>
	<form action="./product">
	<table>
		<tr>
		<th></th>
			<th>Name</th>
			<th>Quantity</th>
			<th>price</th>
			<th>enter quantity</th>
			<th>add</th>
		</tr>
		<tr>
		 <td>
		<%--  <input type="text" name="id" value=<%=productBean%> disabled="disabled"></td> --%>
			<td><%=productBean.getPname()%></td>
			<td><%=productBean.getPqty()%></td>
			<td><%=productBean.getPrice()%></td>
			 <td><input type="number" name="quantity"></td>
			 
			 <td><input type="submit" name="add" value="Add"></td>
			
		</tr>
		
		</table>
		</form>
	<%
		}
	%>
	<h3>${msg}</h3>
</body>
</html>