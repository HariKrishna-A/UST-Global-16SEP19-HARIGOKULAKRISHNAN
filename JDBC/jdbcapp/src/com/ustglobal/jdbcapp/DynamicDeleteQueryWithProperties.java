package com.ustglobal.jdbcapp;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

//import com.mysql.jdbc.Driver;

public class DynamicDeleteQueryWithProperties {
	public static void main(String[] args) {

		Connection con = null;
		PreparedStatement pstmt = null;
		FileReader reader = null;
		
		try 
		{
			
			
			reader = new FileReader("db.properties");
			Properties prop = new Properties();
			prop.load(reader);
			
			//Step_1 : Load Driver 
			Class.forName("com.mysql.jdbc.Driver");

			//Step_2 : Get Connection
			String dburl =prop.getProperty("url");
			con  = DriverManager.getConnection(dburl,prop);                            

			//step_3 : Issue SQL query
			String query = prop.getProperty("delete-query");
			pstmt = con.prepareStatement(query);
			
			
		
			pstmt.setInt(1, Integer.parseInt(args[0]));
			
			
			int count = pstmt.executeUpdate();

			//Step_4 Read the result
			System.out.println( count + "Rows(S) inserted");

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
