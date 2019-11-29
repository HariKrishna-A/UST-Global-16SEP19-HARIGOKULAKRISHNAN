package com.ustglobal.webappust.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FormServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String empName = req.getParameter("ename");
		String empEmail = req.getParameter("email");
		String empPassword = req.getParameter("epassword");

		ServletContext context = getServletContext();
		String companyName = context.getInitParameter("company_name");
		
		
		
		ServletConfig config = getServletConfig();
		String batchName = config.getInitParameter("batch_name");
		
		
		PrintWriter out = resp.getWriter();

		out.println("<html>");
		out.println("<body>");

		out.println("<h1>");
		out.println(empName);
		out.println("</h1>");

		out.println("<h1>");
		out.println(empEmail);
		out.println("</h1>");

		out.println("<h1>");
		out.println(empPassword);
		out.println("</h1>");
		
		out.println("<h2>");
		out.println(companyName);
		out.println("</h2>");
		
		out.println("<h2>");
		out.println(batchName);
		out.println("</h2>");
		
		

		out.println("</body>");
		out.println("</html>");
	}
}
