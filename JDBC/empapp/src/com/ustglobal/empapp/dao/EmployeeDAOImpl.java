package com.ustglobal.empapp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


import com.ustglobal.empapp.dto.EmployeeBean;

public class EmployeeDAOImpl implements EmployeeDAO{

	public List<EmployeeBean> EmployeeDAOData() {

		String dburl = "jdbc:mysql://localhost:3306/ust_ty_db";
		String query = "select* from employee_info";

		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {

			Class.forName("com.mysql.jdbc.Driver");

			conn = DriverManager.getConnection(dburl,"root","root");

			stmt = conn.createStatement();
			rs = stmt.executeQuery(query);

			ArrayList<EmployeeBean> result = new ArrayList<EmployeeBean>();

			while(rs.next()) {

				//				System.out.println("Id     : "+rs.getInt("id"));
				//				System.out.println("Name   : "+rs.getString("name"));
				//				System.out.println("Salary : "+rs.getInt("sal"));
				//				System.out.println("gender : "+rs.getString("gender"));

				EmployeeBean bean = new EmployeeBean();

				int id = rs.getInt("id");
				bean.setId(id);

				String name = rs.getString("name");
				bean.setName(name);

				int sal = rs.getInt("sal");
				bean.setSal(sal);

				String gender = rs.getString("gender");
				bean.setGenter(gender);

				result.add(bean);

			}
			return result;
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return null;
		}
		finally
		{
			try
			{
				if(conn != null)
				{
					conn.close();
				}
				if(stmt != null)
				{
					stmt.close();
				}
				if(rs != null)
				{
					rs.close();
				}
			}
			catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public EmployeeBean searchEmployeeData(int id) {

		String dburl = "jdbc:mysql://localhost:3306/ust_ty_db";
		String query = "select * from employee_info where id = ?";

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try 
		{
			Class.forName("com.mysql.jdbc.Driver");                                            

			con  = DriverManager.getConnection(dburl,"root","root");                            

			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, id);
			rs = pstmt.executeQuery();

			if(rs.next()) {
				EmployeeBean bean = new EmployeeBean();

				bean.setId(rs.getInt("id"));
				bean.setName(rs.getString("name"));
				bean.setSal(rs.getInt("sal"));
				bean.setGenter(rs.getString("gender"));
				return bean;

			}else {
				return null;
			}
		} 
		catch (Exception e)
		{
			e.printStackTrace();
			return null;
		}
		finally
		{
			try
			{
				if(con != null)
				{
					con.close();
				}
				if(pstmt != null)
				{
					pstmt.close();
				}
				if(rs != null)
				{
					rs.close();
				}
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		} 

	}

	public int insertEmployeeData(EmployeeBean bean) {

		String dburl = "jdbc:mysql://localhost:3306/ust_ty_db";
		String query = "insert into  employee_info values(?,?,?,?)";

		Connection con = null;
		PreparedStatement pstmt = null;

		try 
		{

			Class.forName("com.mysql.jdbc.Driver");                                   

			con  = DriverManager.getConnection(dburl,"root","root");                            

			pstmt = con.prepareStatement(query);

			pstmt.setInt(1, bean.getId());
			pstmt.setString(2, bean.getName());
			pstmt.setInt(3, bean.getSal());
			pstmt.setString(4, bean.getGenter());

			
			try {
			int	count = pstmt.executeUpdate();
			return count;	
			} catch (Exception e) {
				System.out.println("ID Exist");
				return 0;
			}
		} 
		catch (Exception e)
		{
			e.printStackTrace();
			return 0;
		}
		finally
		{
			try
			{
				if(con != null)
				{
					con.close();
				}
				if(pstmt != null)
				{
					pstmt.close();
				}
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

	public int updateEmployeeData(EmployeeBean bean) {

		String dburl = "jdbc:mysql://localhost:3306/ust_ty_db";
		String query = "update employee_info set name=?,sal=?,gender=? where id=?";


		Connection con = null;
		PreparedStatement pstmt = null;

		try 
		{

			Class.forName("com.mysql.jdbc.Driver");

			con  = DriverManager.getConnection(dburl,"root","root");                            

			pstmt = con.prepareStatement(query);

			pstmt.setInt(4, bean.getId());
			pstmt.setString(1, bean.getName());
			pstmt.setInt(2, bean.getSal());
			pstmt.setString(3, bean.getGenter());
			
			try {
				int count = pstmt.executeUpdate();
				return count;
			} catch (Exception e) {
				
				System.out.println("NO Id present");
				return 0;
			}

		} 
		catch (Exception e)
		{
			e.printStackTrace();
			return 0;
		}
		finally
		{
			try
			{
				if(con != null)
				{
					con.close();
				}
				if(pstmt != null)
				{
					pstmt.close();
				}
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

	public int deleteEmployeeData(int id) {

		String dburl = "jdbc:mysql://localhost:3306/ust_ty_db";
		String query = "delete from employee_info where id=?";

		Connection con = null;
		PreparedStatement pstmt = null;

		try 
		{

			Class.forName("com.mysql.jdbc.Driver");

			con  = DriverManager.getConnection(dburl,"root","root");                            

			pstmt = con.prepareStatement(query);

			pstmt.setInt(1, id);

			int count = pstmt.executeUpdate();

			return count;
		} 
		catch (Exception e)
		{
			e.printStackTrace();
			return 0;
		}
		finally
		{
			try
			{
				if(con != null)
				{
					con.close();
				}
				if(pstmt != null)
				{
					pstmt.close();
				}
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
