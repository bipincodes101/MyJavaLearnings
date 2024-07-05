package com.JdbcUtil.in;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class MyJdbcUtilityClass {
	// step->1
	static {
		// my sql driver is loading.
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}

	// step->2
	// establish the connection betweent database and sql driver
	public static Connection getJdbcConnection() throws SQLException, IOException {
		FileInputStream fis = new FileInputStream(
				"D:\\JavaCodes\\Project1\\src\\application.properties");
		Properties properties = new Properties();
		properties.load(fis);
		Connection connection = DriverManager.getConnection(properties.getProperty("url"),
				properties.getProperty("userName"), properties.getProperty("password"));
		return connection;
	}
	public static void cleanUP(Statement statement,Connection connection ,ResultSet resultSet) throws SQLException {
		if(resultSet!=null) {
			resultSet.close();
		}if(statement!=null) {
			statement.close();
		}if(connection!=null) {
			connection.close();
		}
	}

}
