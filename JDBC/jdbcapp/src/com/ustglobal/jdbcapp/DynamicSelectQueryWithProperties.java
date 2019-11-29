package com.ustglobal.jdbcapp;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import com.mysql.jdbc.Driver;

public class DynamicSelectQueryWithProperties {
	public static void main(String[] args) {


		String dburl = "jdbc:mysql://localhost:3306/ust_ty_db";
		String query = "select * from employee_info";

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		FileReader reader = null;
		
		try 
		{
			
			
			reader = new FileReader("db.properties");
			Properties prop = new Properties();
			prop.load(reader);
			
			//Step_1 : Load the Driver
			Class.forName(prop.getProperty("driver-class-name"));                                        

			//Step_2 : Get Connection
			con  = DriverManager.getConnection(dburl,prop);                            

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
				if(rs != null)
				{
					rs.close();
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
