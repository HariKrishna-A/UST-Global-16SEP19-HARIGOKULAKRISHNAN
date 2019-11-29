package com.ustglobal.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/login.html")
public class LoginPageservlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		PrintWriter out = resp.getWriter();

		String id = "";
		Cookie[] cookies = req.getCookies();
		if(cookies!=null) {

			for (Cookie cookie : cookies) {
				if(cookie.getName().equals("alwaysRemember")) {
					id= cookie.getValue();
				}
			}
		}


		out.println("\r\n" + 
				"	<div style='background-color: black; color: white; margin-top: 1cm;'>\r\n" + 
				"		<center>\r\n" + 
				"			<h1>LOGIN</h1>\r\n" + 
				"		</center>\r\n" + 
				"	</div>\r\n" + 
				"	<form action='./login' method='post'>\r\n" + 
				"		<table align='center'>\r\n" + 
				"			<tr>\r\n" + 
				"				<td>ID</td>\r\n" + 
				"				<td><input type='number' name='id' value='"+id+"'></td>\r\n" + 
				"			</tr>\r\n" + 
				"			<tr>\r\n" + 
				"				<td>PASSWORD</td>\r\n" + 
				"				<td><input type='password' name='password' id='password'\r\n" + 
				"					class='tb'></td>\r\n" + 
				"			</tr>\r\n" + 
				"			<td><input type='reset' name='reset'></td>\r\n" + 
				"			<td><input type='submit' name='submit' value='login'\r\n" + 
				"				style='margin-right: 2cm;'></td>\r\n" + 
				"		</table>\r\n" + 
				"		<br>\r\n" + 
				"		<div align='center'>\r\n" + 
				"			<input type='checkbox' name='rememberme' value='checked'>&nbsp;<label\r\n" + 
				"				for='remberme'>Remember_Me</label>\r\n" + 
				"		</div>\r\n" + 
				"		<br>\r\n" + 
				"		<div align='center'>\r\n" + 
				"			<a href='register.html'>Register here.....</a>\r\n" + 
				"		</div>\r\n" + 
				"	</form>");


	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}
