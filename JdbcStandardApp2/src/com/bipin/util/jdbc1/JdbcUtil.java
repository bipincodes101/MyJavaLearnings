package com.bipin.util.jdbc1;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;
public class JdbcUtil {
	private JdbcUtil() {//used private constructor for avoiding object creation of this class.
		
	}
	//step->1
	//loading the driver
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		System.out.println("Driver is loaded..");
	}
	//step->2 
	//estanlish the connection object .
	public static Connection getJdbcConnection() throws IOException, SQLException {
		FileInputStream fis=new FileInputStream("D:\\JavaCodes\\JdbcStandardApp2\\src\\com\\application_properties\\application.properties");
		Properties p=new Properties();
		p.load(fis);
		Connection connection =DriverManager.getConnection(p.getProperty("url"),p.getProperty("userName"),p.getProperty("password"));
		
		return connection;
	}
	//last step.
	//close all the resources.
	public static void cleanUp( Connection connection ,Statement statement ,ResultSet resultSet) throws SQLException {
		if(connection!=null ) {
			connection.close();
		}
		if(statement!=null) {
			statement.close();
		}
		if(resultSet!=null) {
			resultSet.close();
		}
	}
}
