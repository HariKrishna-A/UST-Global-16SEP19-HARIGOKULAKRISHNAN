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
	<h3>${msg}</h3>
		<legend>Update Profile</legend>
		<form action="./update" method="post">

			<table>
				<tr>
					<td>NAME :</td>
					<td><input type="text" name="name"></td>
				</tr>
				<tr>
					<td>EMAIL :</td>
					<td><input type="email" name="email"></td>
				</tr>
				<tr>
					<td>DOJ :</td>
					<td><input type="date" name="doj"></td>
				</tr>
				<tr>
					<td>GENDER :</td>
					<td><select name="gender" required="required">
							<option>-------Select-------</option>
							<option value="M">Male</option>
							<option value="F">Female</option>

					</select></td>
				</tr>
				<tr>
					<td><input type="reset" value="Reset"></td>
					<td><input type="submit" value="UpdateProfile"></td>
				</tr>
			</table>
		</form>
	</fieldset>
	
</body>
</html>