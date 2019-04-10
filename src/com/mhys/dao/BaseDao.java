package com.mhys.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BaseDao {
	public Connection getConnection() throws SQLException{
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return DriverManager.getConnection("jdbc:mysql://localhost:8080/emp?useUnicode=true&characterEncoding=utf-8", "root", "root");
		
	}
}
