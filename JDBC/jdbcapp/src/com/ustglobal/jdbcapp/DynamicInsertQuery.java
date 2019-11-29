package com.ustglobal.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class DynamicInsertQuery {
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
			String query = "insert into  employee_info values(?,?,?,?)";
			pstmt = con.prepareStatement(query);
			
			String empId = args[0];
			int id = Integer.parseInt(empId);
			pstmt.setInt(1, id);
			
			String name = args[1];
			pstmt.setString(2, name);
			
			String empSal = args[2];
			int sal = Integer.parseInt(empSal);
			pstmt.setInt(3, sal);
			
			String gender = args[3];
			pstmt.setString(4, gender);
			
			try {
				int count = pstmt.executeUpdate();
				//Step_4 Read the result
				System.out.println(count + "Rows(S) inserted");
			} catch (Exception e) {
				System.err.println("Id "+id+" is already present.");
				System.out.println("Try New ID ..");
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
			}
			catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
