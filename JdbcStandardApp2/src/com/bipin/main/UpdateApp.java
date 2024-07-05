package com.bipin.main;
import java.io.IOException;
import java.sql.*;
import java.util.Scanner;
import com.bipin.util.jdbc1.JdbcUtil;
public class UpdateApp {

	public static void main(String[] args) {
	Connection connection=null;
	PreparedStatement preparedStatement=null;
	Scanner scanner=null;
		try {
			connection=JdbcUtil.getJdbcConnection();
			if(connection!=null) {
				String sqlUpdateQuery="update  employee_details set address=? where postal_code=?";
				preparedStatement=	connection.prepareStatement(sqlUpdateQuery);
			}
			if(preparedStatement!=null) {
				scanner=new Scanner(System.in);
				System.out.println("enter the postal_code : ");
				int postal_code=scanner.nextInt();
				System.out.println("enter the address of customer : ");
				String address=scanner.next();
				preparedStatement.setString(1, address);
				preparedStatement.setInt(2,postal_code);
				int rowAffected=preparedStatement.executeUpdate();
				System.out.println("total row affected is : "+rowAffected);
			}
		} catch (IOException | SQLException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				JdbcUtil.cleanUp(connection, preparedStatement, null);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
