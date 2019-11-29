package com.ustglobal.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

//import com.mysql.jdbc.Driver;

public class DynamicDeleteQuery {
	public static void main(String[] args) {

		Connection con = null;
		PreparedStatement pstmt = null;

		try 
		{
			//Step_1 : Load the Driver
//			Driver driverref = new Driver();
//			DriverManager.registerDriver(driverref);  
			Class.forName("com.mysql.jdbc.Driver");

			//Step_2 : Get Connection
			String dburl = "jdbc:mysql://localhost:3306/ust_ty_db";
			con  = DriverManager.getConnection(dburl,"root","root");                            

			//step_3 : Issue SQL query
			String query = "delete from employee_info where id=?";
			pstmt = con.prepareStatement(query);
			
			
		
			pstmt.setInt(1, Integer.parseInt(args[0]));
			
			
			int count = pstmt.executeUpdate();

			//Step_4 Read the result
			System.out.println( count + "Rows(S) inserted");

		} 
		catch (SQLException e)
		{
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
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
