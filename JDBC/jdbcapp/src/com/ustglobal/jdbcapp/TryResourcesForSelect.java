package com.ustglobal.jdbcapp;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class TryResourcesForSelect {
	
	public static void main(String[] args) {
		
		try(FileReader reader = new  FileReader("db.properties")){
			
			Properties prop = new Properties();
			prop.load(reader);
			
			Class.forName(prop.getProperty("driver-class-name"));
			
			String dburl = prop.getProperty("url");
			
			String query = prop.getProperty("select-query");	
			
			try(Connection con = DriverManager.getConnection(dburl,prop);
				PreparedStatement pstmt = con.prepareStatement(query);
					ResultSet rs = pstmt.executeQuery()){
				
				while(rs.next()) {
					System.out.println("Id : "+rs.getInt("id"));
					System.out.println("Name : "+rs.getString("name"));
					System.out.println("Salary : "+rs.getInt("sal"));
					System.out.println("Gender : "+rs.getString("gender"));
				}
				

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
