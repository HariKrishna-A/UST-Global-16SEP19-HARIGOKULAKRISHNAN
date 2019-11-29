package com.ustglobal.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class ExecuteDeleteQuery {
	public static void main(String[] args) {

		Connection con = null;
		Statement stmt = null;

		try 
		{
			//Step_1 : Load the Driver
			Driver driverref = new Driver();
			DriverManager.registerDriver(driverref);                                            

			//Step_2 : Get Connection
			String dburl = "jdbc:mysql://localhost:3306/ust_ty_db";
			con  = DriverManager.getConnection(dburl,"root","root");                            

			//step_3 : Issue SQL query
			String query = "delete from employee_info where id=6";
			stmt = con.createStatement();
			int count = stmt.executeUpdate(query);

			//Step_4 Read the result
			System.out.println( count + "Rows(S) inserted");

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
				if(stmt != null)
				{
					stmt.close();
				}
			}
			catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
