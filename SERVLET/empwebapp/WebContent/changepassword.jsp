<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<jsp:useBean id = "msg" class="java.lang.String" scope="request"/>
<body>
	<div style="background-color: black; color: white; margin-top: 1cm">
		<center>
			<h1>CHANGE PASSWORD</h1>
		</center>
	</div>

	<a href="./home">HOME</a>
	<a style="float: Right;" href="./logout">LOG_OUT</a>
	<h4><%=msg%></h4>
	<fieldset align="center">
		<legend>Change Password</legend>
		<form action="./changepassword" method="post">

			<table align="center">
				<tr>
					<td>New Password</td>
					<td><input type="password" name="password"  required="required"></td>
				</tr>

				<tr>
					<td>Conform Password</td>
					<td><input type="password" name="confirmpassword"  required="required"></td>
				</tr>

				<td><input type="reset" value="Reset"></td>
				<td><input type="submit" value="Change Password"></td>

			</table>

		</form>
	</fieldset>


</body>
</html>