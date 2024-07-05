package com.bipin.main;
import java.util.*;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import com.bipin.util.jdbc1.JdbcUtil;

public class InsertAppWithDynamicInput {

	public static void main(String[] args) {
		// create connection object.
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		Scanner scanner=null;
		try {
			connection = JdbcUtil.getJdbcConnection();
			String sqlDynamicInsertQuery = "insert into employee_details(`customer_name`,`contact_name`,`address`,`city`,`postal_code`,`country`)values (?,?,?,?,?,?)";
			if (connection != null) {
				preparedStatement = connection.prepareStatement(sqlDynamicInsertQuery);//use compiled query to set data.
				if (preparedStatement != null) {
					scanner=new Scanner(System.in);
					System.out.print("enter the cutomer name : ");
					String customer_name=scanner.next();
					System.out.print("enter the contact name : ");
					String contact_name=scanner.next();
					System.out.print("enter the address : ");
					String address=scanner.next();
					System.out.println("enter the city name : ");
					String city =scanner.next();
					System.out.println("enter the postal code : ");
					int postal_code=scanner.nextInt();
					System.out.print("enter the country name : ");
					String country =scanner.next();
					preparedStatement.setString(1, customer_name);
					preparedStatement.setString(2, contact_name);
					preparedStatement.setString(3, address);
					preparedStatement.setString(4, city);
					preparedStatement.setInt(5, postal_code);
					preparedStatement.setString(6, country);
					int rowCount = preparedStatement.executeUpdate();
					System.out.println("total row updated is : " + rowCount);
				   }
				}
		} catch (SQLException se) {
			se.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				
				JdbcUtil.cleanUp(connection, preparedStatement, null);
				scanner.close();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}

	}

}
