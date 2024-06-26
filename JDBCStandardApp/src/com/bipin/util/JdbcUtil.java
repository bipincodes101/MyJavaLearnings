package com.bipin.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class JdbcUtil {
		//connect with database activity.
	 private JdbcUtil() {
		 //its object creation is not possible because it is a private constructor.
	 }
	 static {
		 //step:1->loading the mysql Driver.
		 try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		 System.out.println("driver is loaded..");
	 }
	 //step: 2-> connect with database .
	 
		public static Connection getJdbcConnection() throws SQLException {
			String url="jdbc:mysql:/employee";
			String userName="root";
			String password="bipin@123";
			Connection connection =DriverManager.getConnection(url,userName,password);
			System.out.println("connection object is created");
			return connection;
		}
		
		//last step->
		//close all the resources.
		public void cleanUp(Connection connection,Statement statement,ResultSet resultSet) throws SQLException {
			if(connection!=null) {
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
