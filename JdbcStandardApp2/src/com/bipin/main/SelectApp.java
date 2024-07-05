package com.bipin.main;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import com.bipin.util.jdbc1.JdbcUtil;
import java.sql.ResultSet;
import java.util.Scanner;
public class SelectApp {

	public static void main(String[] args) throws IOException, SQLException {
		Connection connection=null;
		PreparedStatement prepareStatement=null;
		ResultSet resultSet=null;
		Scanner scanner=null;
		String customer_name=null;
		connection=JdbcUtil.getJdbcConnection();
		String selectSqlQuery="select customer_name,contact_name,address,city,postal_code,country from employee_details where customer_name = ?";
		if(connection!=null) {
			prepareStatement =connection.prepareStatement(selectSqlQuery);
		}
		if(prepareStatement!=null) {
		
		scanner =new Scanner(System.in);
		System.out.println("enter the customer_name : ");
		customer_name=scanner.next();
		prepareStatement.setString(1, customer_name);
		resultSet=	prepareStatement.executeQuery();
		if(resultSet!=null) {
			if(resultSet.next()) {
				System.out.println("CUSTOMER_NAME\tCONTACT_NAME\tADDRESS\tCITY\tPOSTAL_CODE\tCOUNTRY\t");
				System.out.println(resultSet.getString(1)+"\t"+resultSet.getString(2)+"\t"+resultSet.getString(3)+"\t"+resultSet.getString(4)+"\t"+resultSet.getInt(5)+"\t"+resultSet.getString(6));
			}	
		else {
			System.out.println("any customer is not present with this name : "+customer_name);
		}
		 }
		}
			JdbcUtil.cleanUp(connection,prepareStatement,resultSet);
			
		}
	}


