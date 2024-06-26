import java.lang.*;
import java.sql.*;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;

		try {
			// step:1 -> load and register the Driver.

			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("driver loaded successfully");

			// step: 2 -> connection with database.
			String url = "jdbc:mysql://localhost:3306/bookstore";
			String userName = "root";
			String password = "bipin@123";
			connection = DriverManager.getConnection(url, userName, password);
			System.out.println("your connection is successful");
			System.out.println("the implementation class is fd" + connection.getClass().getName());

			// step:3 -> create statement object and send the query.

			String sqlSelectQuery = "select id,name ,category,price from books";
			statement = connection.createStatement();
			System.out.println("the impementation clas name is : " + statement.getClass().getName());

			resultSet = statement.executeQuery(sqlSelectQuery);
			System.out.println("the implemetation class name is : " + resultSet.getClass().getName());

			// step:4 -> process the result.

			while (resultSet.next()) {
				Integer id = resultSet.getInt(1);
				String name = resultSet.getString(2);
				String category = resultSet.getString(3);
				Integer price = resultSet.getInt(4);
				System.out.println(id + "\t" + name + "\t" + category + "\t" + price);

			}
		} catch (ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
		} catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(connection!=null) {
					connection.close();
					System.out.println("connection is closed");
				}
			}catch(SQLException e) {
				e.printStackTrace();
				
			}
		}

	}

}
