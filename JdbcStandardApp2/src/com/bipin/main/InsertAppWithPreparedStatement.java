package com.bipin.main;

import java.sql.*;

import com.bipin.util.jdbc1.JdbcUtil;

public class InsertAppWithPreparedStatement {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection connection = null;
		PreparedStatement pstmt = null;
		try {
			connection = JdbcUtil.getJdbcConnection();
			String sqlInsertQuery = "insert into employee_details(`customer_name`,`contact_name`,`address`,`city`,`postal_code`,`country`)values (?,?,?,?,?,?)";
			if (connection != null) {
				pstmt = connection.prepareStatement(sqlInsertQuery);
			}
			if(pstmt!=null) {
				//use compiled query to set the values.
				pstmt.setString(1,"bipin ");
				pstmt.setString(2, "bips");
				pstmt.setString(3, "ratanpur");
				pstmt.setString(4, "uttarpradesh");
				pstmt.setString(5,"208020");
				pstmt.setString(6, "India");
				System.out.println(sqlInsertQuery);
				//execute the query.
				int rowCount=pstmt.executeUpdate();
				System.out.println("total row updated :: "+rowCount);
			}
			System.out.println("connection is created...");
		} catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.cleanUp(connection, null, null);
			System.out.println("closing the resource..");
		}

	}
}
