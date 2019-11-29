package com.ustglobal.jdbcapp;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class CSVFileForInsert {

	public static void main(String[] args) {

		String dburl = "jdbc:mysql://localhost:3306/ust_ty_db";
		String query= "insert into  employee_info values(?,?,?,?)";

		try(FileReader in = new FileReader("csv.txt");
				BufferedReader reader = new BufferedReader(in);
				Connection conn = DriverManager.getConnection(dburl,"root","root");
				PreparedStatement pstmt = conn. prepareStatement(query)){

			while(reader.ready()) {
				String Line = reader.readLine();
				String[] datas = Line.split(",");

				int id = Integer.parseInt(datas[0]);
				pstmt.setInt(1, id);

				String name = datas[1];
				pstmt.setString(2, name);

				pstmt.setInt(3, Integer.parseInt(datas[2]));

				pstmt.setString(4, datas[3]);

				pstmt.addBatch();                          //for add at 1 st

			}
			int[] count = pstmt.executeBatch();
			System.out.println(count.length + " Row(s) inserted");
		}
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
