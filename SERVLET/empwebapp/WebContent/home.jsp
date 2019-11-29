<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <jsp:useBean id="info" class="com.ustglobal.empwebapp.dto.EmployeeInfo" scope="session"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1 align='center'>Welcome </h1>
<table align=\"center\">
<tr><th>NAME </th><td><%=info.getName()%></td></tr><br>
<tr><td><a href='./search.html' value="search">Search</a></td></tr>
<tr><td><a href='./changepassword.jsp'>Change Password</a></td></tr>
<tr><td><a href='./logout'>Logout</a></td></tr>
<table>


</body>
</html>