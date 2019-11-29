package com.ustglobal.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class DynamicUpdateQuery {
	public static void main(String[] args) {

		Connection con = null;
		PreparedStatement pstmt = null;

		try 
		{
			//Step_1 : Load the Driver
			Driver driverref = new Driver();
			DriverManager.registerDriver(driverref);                                            

			//Step_2 : Get Connection
			String dburl = "jdbc:mysql://localhost:3306/ust_ty_db";
			con  = DriverManager.getConnection(dburl,"root","root");                            

			//step_3 : Issue SQL query
			String query = "update employee_info set name=?,sal=?,gender=? where id=?";
			pstmt = con.prepareStatement(query);

			String empid = args[0];
			int id = Integer.parseInt(empid);

			String name = args[1];

			String empSal = args[2];
			int sal = Integer.parseInt(empSal);

			String gender = args[3];

			pstmt.setInt(4, id);
			pstmt.setString(1, name);
			pstmt.setInt(2, sal);
			pstmt.setString(3, gender);

			int count = pstmt.executeUpdate();


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
				if(pstmt != null)
				{
					pstmt.close();
				}
			}
			catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
