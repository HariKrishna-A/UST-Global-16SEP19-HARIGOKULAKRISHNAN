package com.ustglobal.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ustglobal.empwebapp.dao.EmployeeDAO;
import com.ustglobal.empwebapp.dto.EmployeeInfo;
import com.ustglobal.empwebapp.util.EmployeeDaoManager;


@WebServlet("/search")
public class SearchServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		HttpSession session = req.getSession(false);

		if(session == null) {
			RequestDispatcher dispatcher = req.getRequestDispatcher("/login.jsp");
			dispatcher.forward(req, resp);
		}
		
		else {
		EmployeeDAO dao = EmployeeDaoManager.getEmployeeDAO();			

			EmployeeInfo info = dao.searchEmployee(Integer.parseInt(req.getParameter("id")));

			req.setAttribute("info", info);
			RequestDispatcher dispatcher = req.getRequestDispatcher("/search.jsp");
			dispatcher.forward(req, resp);
//			PrintWriter out = resp.getWriter();
//			out.println("<html><body><a href='./home'>HOME</a>");
//			out.println("<a style= 'float:right' href='./logout'>LOG_OUT</a>");
//
//			if(info!=null) {
//				out.println("<table align=\"center\">");
//				out.println("<tr>");
//				out.println("<th>ID</th><th>NAME</th><th>EMAIL</th>");
//				out.println("</tr>");
//				out.println("<tr>");
//				out.println("<td>"+info.getId()+"</td>"+"<td>"+info.getName()+"</td>"+"<td>"+info.getEmail()+"</td>");
//				out.println("</tr>");
//				out.println("<table>");
//			}
//			else {
//				out.println("No Data Found");
//			}
//			out.println("</html>");
		
		}
	}
}

