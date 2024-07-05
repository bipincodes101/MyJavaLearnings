package com.bipin.main;
import java.io.IOException;
import java.sql.*;
import java.util.Scanner;

import com.bipin.util.jdbc1.JdbcUtil;
public class DeleteApp {

	public static void main(String[] args) throws IOException, SQLException {
		Connection connection=null;
		PreparedStatement preparedStatement=null;
		Scanner scanner=null;
		connection =JdbcUtil.getJdbcConnection();
		if(connection!=null) {
			String sqlDeleteQuery="delete from employee_details where customer_name=?";
			preparedStatement=connection.prepareStatement(sqlDeleteQuery);
			if(preparedStatement!=null) {
				scanner=new Scanner(System.in);
				System.out.println("enter the customer name : ");
				String customer_name=scanner.next();
				preparedStatement.setString(1, customer_name);
				int rowAffected=preparedStatement.executeUpdate();
				System.out.println("total row deleted is : "+rowAffected);
			}
		}
		JdbcUtil.cleanUp(connection, preparedStatement, null);

	}

}
