package com.bipin.main;

import java.sql.*;

import com.bipin.util.JdbcUtil;

/**
 * @author Bipin
 * @company home
 * @see code
 */
class InsertApp {
	public static void main(String[] args) throws ClassNotFoundException {

		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		try {
			connection = JdbcUtil.getJdbcConnection();
			if (connection != null)
				statement = connection.createStatement();
			if (statement != null)
				resultSet = statement
						.executeQuery("select customer_name,contact_name,address,city,postal_code,country from employee_details");
			if (resultSet != null) {
				System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s","CUSTOMER_NAME","CONTACT_NAME","ADDRESS","CITY","POSTAL_CODE","COUNTRY");
				while (resultSet.next()) {
					System.out.printf("%-15s%-15s%-15s%-15s%-15d%-15s",resultSet.getString(1), resultSet.getString(2) , resultSet.getString(3) , resultSet.getString(4) , resultSet.getInt(5) , resultSet.getString(6));
					System.out.println();		
					}
			}
		} catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
