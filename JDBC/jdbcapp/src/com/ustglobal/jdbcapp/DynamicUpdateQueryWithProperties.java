package com.ustglobal.jdbcapp;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import com.mysql.jdbc.Driver;

public class DynamicUpdateQueryWithProperties {
	public static void main(String[] args) {

		Connection con = null;
		PreparedStatement pstmt = null;
		FileReader reader = null;
		
		try 
		{
			
			reader = new FileReader("db.properties");
			Properties prop = new Properties();
			prop.load(reader);
			
			//Step_1 : Load the Driver
//			Driver driverref = new Driver();
//			DriverManager.registerDriver(driverref);     
			Class.forName(prop.getProperty("driver-class-name"));

			//Step_2 : Get Connection
			String dburl =prop.getProperty("url");
			con  = DriverManager.getConnection(dburl,prop);                            

			//step_3 : Issue SQL query
			String query = prop.getProperty("update-query");
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

			try {
				int count = pstmt.executeUpdate();
				//Step_4 Read the result
				System.out.println(count + "Rows(S) inserted");
			} catch (Exception e) {
				System.err.println("Id "+id+" is already present.");
				System.out.println("Try New ID ..");
			}

		} 
		catch (Exception e)
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
			catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
