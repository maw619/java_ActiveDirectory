package com.app.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

	public Connection conn;
	
	public void getConn() {
		String url = "jdbc:mysql://localhost:3306/activedirectoryusers";
		String user = "root";
		String pass = "";
		
		try {
			conn = DriverManager.getConnection(url,user,pass);
			System.out.println("Connected");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
