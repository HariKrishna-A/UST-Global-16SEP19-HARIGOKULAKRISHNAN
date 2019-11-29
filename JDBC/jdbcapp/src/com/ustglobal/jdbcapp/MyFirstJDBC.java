package com.ustglobal.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class MyFirstJDBC {
	public static void main(String[] args) {

		Connection con = null;
		Statement stmt = null;
		ResultSet rst = null;



		try 
		{
			Driver driverref = new Driver();
			DriverManager.registerDriver(driverref);                                                       //Loading Driver
			
			
//			String dburl = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
			String dburl = "jdbc:mysql://localhost:3306/ust_ty_db";
			con  = DriverManager.getConnection(dburl,"root","root");                                      //Connection via Driver


			String query = "select * from employee_info";
			stmt = con.createStatement();
			rst = stmt.executeQuery(query);                                                               //SQL Query Connection


			while(rst.next())
			{
				int reg_no = rst.getInt("id");
				String name = rst.getString("name");
				String gender = rst.getString("gender");
				String salary = rst.getString("sal");

				System.out.println("Id : "+reg_no);
				System.out.println("Name : "+name);
				System.out.println("Gender : "+gender);
				System.out.println("Salary : "+salary);                                                   //Proess result obtain frm sql query
				System.out.println("_____________________");
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
				if(rst != null)
				{
					rst.close();
				}
				if(stmt != null)
				{
					stmt.close();
				}
			}
			catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
