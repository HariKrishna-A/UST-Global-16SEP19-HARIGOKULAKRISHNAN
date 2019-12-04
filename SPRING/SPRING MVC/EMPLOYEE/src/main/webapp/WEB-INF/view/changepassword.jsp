<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<a href="./home">Home</a>
	<a href="./logout" style="float: right;">Logout</a>
	<fieldset>
		<legend>Change Password </legend>
		<form action="./changepassword" method="post">
			<table>
				<tr>
					<td>NEW PASSWORD :</td>
					<td><input type="password" name="npassword"></td>
					<td>CONFIRM PASSWORD :</td>
					<td><input type="password" name="cpassword"></td>
				</tr>
				<tr>
					<td><input type="reset" name="Reset"></td>
					<td><input type="submit" name="submit"></td>
				</tr>
			</table>
		</form>
	</fieldset>
</body>
</html>