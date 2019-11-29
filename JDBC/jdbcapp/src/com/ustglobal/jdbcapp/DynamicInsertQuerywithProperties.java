package com.ustglobal.jdbcapp;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import com.mysql.jdbc.Driver;

public class DynamicInsertQuerywithProperties {
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
			Class.forName(prop.getProperty("driver-class-name"));                                        

			//Step_2 : Get Connection
			String dburl = prop.getProperty("url");
			con  = DriverManager.getConnection(dburl,prop);                            

			//step_3 : Issue SQL query
			String query = prop.getProperty("insert-query");
			pstmt = con.prepareStatement(query);
			
			String empId = args[0];
			int id = Integer.parseInt(empId);
			pstmt.setInt(1, id);
			
			String name = args[1];
			pstmt.setString(2, name);
			
//			String empSal = args[2];
//			int sal = Integer.parseInt(empSal);
//			pstmt.setInt(3, sal);
			pstmt.setInt(3, Integer.parseInt(args[2]));
			
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
				if(reader != null)
				{
					reader.close();
				}
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
