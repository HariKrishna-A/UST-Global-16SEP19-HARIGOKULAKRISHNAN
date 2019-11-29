<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@page session="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

<jsp:useBean id="msg" class="java.lang.String" scope="request"></jsp:useBean>

<%
String id = "";
Cookie[] cookies = request.getCookies();
if(cookies!=null) {

	for (Cookie cookie : cookies) {
		if(cookie.getName().equals("alwaysRemember")) {
			id= cookie.getValue();
		}
	}
}

%>
<body>

	<div style='background-color: black; color: white; margin-top: 1cm;'>
		<center>
			<h1>LOGIN</h1>
		</center>
	</div>
	<form action='./login' method='post'>
		<table align='center'>
			<tr>
				<td>ID</td>
				<td><input type='text' name='id' id='id' value='<%=id%>'></td>
			</tr>
			<tr>
				<td>PASSWORD</td>
				<td><input type='password' name='password' id='password'
					class='tb'></td>
			</tr>
			<td><input type='submit' name='submit' value='login'
				style='margin-right: 2cm;'></td>
			<td><input type='reset' name='reset'></td>
		</table>
		<br>
		<div align='center'>
			<input type='checkbox' name='rememberme' value='checked'>&nbsp;<label
				for='remberme'>Remember_Me</label>
		</div>
		<br>
		<div align='center'>
			<a href='register.html'>Register here.....</a>
		</div>
	</form>


</body>
</html>