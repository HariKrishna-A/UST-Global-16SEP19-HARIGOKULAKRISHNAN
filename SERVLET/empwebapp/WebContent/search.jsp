<%@page import="com.ustglobal.empwebapp.dto.EmployeeInfo"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<%

EmployeeInfo info = (EmployeeInfo)request.getAttribute("info");

%>

<body>

<a href='./home'>HOME</a>
<a style= 'float:right' href='./logout'>LOG_OUT</a>
<%if(info != null){ %>
<fieldset>
<legend>Employee_Info</legend>
<table align="center">
<tr>
<th>ID</th><th>NAME</th><th>EMAIL</th>
</tr>
<tr>
<td><%=info.getId()%></td>
<td><%=info.getName() %></td>
<td><%=info.getEmail() %></td>
</tr>
<table>
</fieldset>
<%} else { %>
<h1>NO Data Found</h1>
<%} %>
</body>
</html>