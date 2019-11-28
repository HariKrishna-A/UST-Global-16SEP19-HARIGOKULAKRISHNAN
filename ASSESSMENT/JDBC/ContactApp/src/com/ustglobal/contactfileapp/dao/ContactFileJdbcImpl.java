package com.ustglobal.contactfileapp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.ustglobal.contactfileapp.dto.ContactBean;

public class ContactFileJdbcImpl  implements ContactFileDao{
	final static String URL = "jdbc:mysql://localhost:3306/contactfile?user=root&password=root";
	final static String DRIVER = "com.mysql.jdbc.Driver";
	String INSERT_QUERY = "insert into contact values(?,?,?)";
	String SELECT_ALL_QUERY = "select * from contact";
	String SELECT_QUERY = "select * from contact where name=?";
	String UPDATE_QUERY = "update into contact set number=?,groups=? where name=?";
	String DELETE_QUERY = "delete from contact where name=?";
	@Override
	public List<String> selectAllContact() {
		try {
			Class.forName(DRIVER);

			try(Connection conn = DriverManager.getConnection(URL);
					Statement stmt = conn.createStatement();
					ResultSet rs = stmt.executeQuery(SELECT_ALL_QUERY)){

				ArrayList<String> beans = new ArrayList<String>();

				while(rs.next()) {

					beans.add(rs.getString("name"));
				}
				return beans;
			}

		}catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	@Override
	public ContactBean searchContact(String name) {


		try {
			Class.forName(DRIVER);

			try(Connection conn=DriverManager.getConnection(URL);
					Statement stmt=conn.createStatement();
					PreparedStatement pstmt=conn.prepareStatement(SELECT_QUERY)){
				pstmt.setString(1, name);
				ResultSet rs=pstmt.executeQuery();

				ContactBean bean=new ContactBean();

				if(rs.next()) {
					bean.setName(rs.getString("name"));
					bean.setGroup(rs.getString("groups"));
					bean.setNumber(rs.getInt("number"));
					return bean;
				}
				return null;
			}

		}catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	@Override
	public int addContact(ContactBean bean) {

		try {
			Class.forName(DRIVER);

			try(Connection conn=DriverManager.getConnection(URL);
					Statement stmt=conn.createStatement();
					PreparedStatement pstmt=conn.prepareStatement(INSERT_QUERY)){
				pstmt.setString(1,bean.getName());
				pstmt.setInt(2, bean.getNumber());
				pstmt.setString(3,bean.getGroup());
				int count=pstmt.executeUpdate();
				return count;
			}
			catch (Exception e) {
			}

		}catch (Exception e) {
		}
		return 0;
	}
	@Override
	public int deleteContact(String name) {

		try {
			Class.forName(DRIVER);

			try(Connection conn=DriverManager.getConnection(URL);
					Statement stmt=conn.createStatement();
					PreparedStatement pstmt=conn.prepareStatement(DELETE_QUERY)){
				pstmt.setString(1,name);
				int count=pstmt.executeUpdate();
				return count;
			}
			catch (Exception e) {
			}

		}catch (Exception e) {
		}
		return 0;
	}
	@Override
	public int updateContact(ContactBean bean) {
		try {
			Class.forName(DRIVER);

			try(Connection conn=DriverManager.getConnection(URL);
					Statement stmt=conn.createStatement();
					PreparedStatement pstmt=conn.prepareStatement(UPDATE_QUERY)){
				pstmt.setString(3,bean.getName());
				pstmt.setInt(1, bean.getNumber());
				pstmt.setString(2,bean.getGroup());
				int count=pstmt.executeUpdate();
				return count;
			}
			catch (Exception e) {
			}

		}catch (Exception e) {
		}
		return 0;
	}
}
