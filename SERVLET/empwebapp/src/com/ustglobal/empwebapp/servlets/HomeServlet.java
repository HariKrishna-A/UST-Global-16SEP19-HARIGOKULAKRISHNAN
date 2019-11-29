package com.ustglobal.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ustglobal.empwebapp.dto.EmployeeInfo;

@WebServlet("/home")
public class HomeServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		HttpSession session = req.getSession(false);
		if(session!=null) {
//			EmployeeInfo info = (EmployeeInfo)session.getAttribute("info");

//			PrintWriter out = resp.getWriter();
			
//			out.println("<html><h1 align='center'>Welcome</h1>");
//			out.println("<table align=\"center\">");
//			out.println("<tr><th>NAME "+"</th><td>"+info.getName()+"</td></tr><br>");
//			out.println("<tr><th>ID  "+"</th><td>"+info.getId()+"</td></tr>");
//			out.println("<tr><td><a href='./search.html'>Search</a></td></tr>");
//			out.println("<tr><td><a href='./changepassword.html'>Change Password</a></td></tr>");
//			out.println("<tr><td><a href='./logout'>Logout</a></td></tr>");
//			out.println("<table></html>");
			
			RequestDispatcher dispatcher = req.getRequestDispatcher("/home.jsp");
			dispatcher.forward(req, resp);
			
		}else {
			RequestDispatcher dispatcher = req.getRequestDispatcher("/login.jsp");
			dispatcher.forward(req, resp);
		}
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req,resp);
	}
}
