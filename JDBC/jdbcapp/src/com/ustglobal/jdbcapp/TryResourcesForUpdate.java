package com.ustglobal.jdbcapp;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class TryResourcesForUpdate {
	
	public static void main(String[] args) {
		
		try(FileReader reader = new  FileReader("db.properties")){
			
			Properties prop = new Properties();
			prop.load(reader);
			
			Class.forName(prop.getProperty("driver-class-name"));
			
			String dburl = prop.getProperty("url");
			
			String query = prop.getProperty("update-query");	
			
			try(Connection con = DriverManager.getConnection(dburl,prop);
				PreparedStatement pstmt = con.prepareStatement(query)){
				
				String empid = args[0];
				int id = Integer.parseInt(empid);
				pstmt.setInt(4,id);
				
				pstmt.setString(1, args[1]);
				
				pstmt.setInt(2, Integer.parseInt(args[2]));
				
				pstmt.setString(3, args[3]);
				
				int count = pstmt.executeUpdate();
				System.out.println(count+" Row(s) Updated");
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		catch (Exception e) {
		e.printStackTrace();
		}
	}
	
}
