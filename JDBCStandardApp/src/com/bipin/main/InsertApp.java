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
				System.out.println("CUSTOMER_NAME\tCONATACT_NAME\tADDRESS\tCITY\tPOSTAL_CODE\tCOUNTRY");
				while (resultSet.next()) {
					System.out.println(resultSet.getString(1) + "\t" + resultSet.getString(2) + "\t"
							+ resultSet.getString(3) + "\t" + resultSet.getString(4) + "\t" + resultSet.getInt(5) + "\t"
							+ resultSet.getString(6));
				}
			}
		} catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
