package com.ustglobal.jdbcapp;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class TryResourcesForDelete {
	
	public static void main(String[] args) {
		
		try(FileReader reader = new  FileReader("db.properties")){
			
			Properties prop = new Properties();
			prop.load(reader);
			
			Class.forName(prop.getProperty("driver-class-name"));
			
			String dburl = prop.getProperty("url");
			
			String query = prop.getProperty("delete-query");	
			
			try(Connection con = DriverManager.getConnection(dburl,prop);
				PreparedStatement pstmt = con.prepareStatement(query)){
				
				pstmt.setInt(1, Integer.parseInt(args[0]));

				int count = pstmt.executeUpdate();
				
				System.out.println(count +" Row(s) deleted");
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
