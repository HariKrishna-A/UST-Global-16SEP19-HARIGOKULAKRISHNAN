package com.ustglobal.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class DynamicSelectQuery {
	public static void main(String[] args) {


		String dburl = "jdbc:mysql://localhost:3306/ust_ty_db";
		String query = "select * from employee_info";

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try 
		{
			//Step_1 : Load the Driver
			Driver driverref = new Driver();
			DriverManager.registerDriver(driverref);                                            

			//Step_2 : Get Connection
			con  = DriverManager.getConnection(dburl,"root","root");                            

			//step_3 : Issue SQL query
			pstmt = con.prepareStatement(query);

		
			rs = pstmt.executeQuery();

			//Step_4 Read the result
			while(rs.next())
			{
				System.out.println("ID : "+rs.getInt("id"));                //return int;
				System.out.println("Name : "+rs.getString("name"));	 		//return String;
				System.out.println("Salary : "+rs.getInt("sal"));			//return int;
				System.out.println("Gender : "+rs.getString("gender"));		//return String;
			}

		} 
		catch (SQLException e)
		{
			e.printStackTrace();
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
			catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
