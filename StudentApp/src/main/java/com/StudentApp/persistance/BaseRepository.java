package com.StudentApp.persistance;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public interface BaseRepository {
	public String url="jdbc:mysql://localhost:3306/student";
	public String dbUser="root";
	public String dbPassword="root@123";
	public String driver="com.mysql.cj.jdbc.Driver";

	public default Connection dbConnect() {
		try {
			Class.forName(driver);
			System.out.println("Driver loaded");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Connection con= DriverManager.getConnection(url, dbUser, dbPassword);
			System.out.println("Connection established..!");
			return con;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
	
	public default void dbClose(Connection con) {
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
