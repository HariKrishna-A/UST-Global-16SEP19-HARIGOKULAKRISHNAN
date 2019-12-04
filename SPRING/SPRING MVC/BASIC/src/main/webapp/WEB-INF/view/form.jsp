<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="./form" method="post">

		<table align="center">
			<tr>
				<td>ID</td>
				<td><input type="number" name="id" id="id"></td>
			</tr>
			<tr>
				<td>NAME</td>
				<td><input type="text" name="name" id="name"></td>
			</tr>
			<tr>
				<td>PASSWORD</td>
				<td><input type="password" name="password" id="password"></td>
			</tr>
			<tr>
				<td>GENDER</td>
				<td><input type="radio" name="gender" value="Male" >Male<input type="radio" name="gender" value="Female">Female</td>
				<!-- <td><input type="text" name="gender"></td> -->
			</tr>
			
			<tr>
			<td>DOJ</td>
			<td><input type="date" name="doj"></td>
			</tr>
			
			<td><input type="reset" name="reset" value="reset"
				style="margin-right: 2cm;"></td>
			<td><input type="submit" name="submit" value="submit"></td>
		</table>
</body>
</html>