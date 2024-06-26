import java.sql.*;
public class UpdateApp {
	public static void main(String[] args) throws ClassNotFoundException,SQLException{
		
		//step:1->load and register the Driver.
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver loaded successfully...");
		
		//step:2->connect with database.
		
		String url="jdbc:mysql:/employee";
		String userName="root";
		String password="bipin@123";
		Connection connection=DriverManager.getConnection(url,userName,password);
		
		//step:3->create the Statement object and execute the query.
		
		String sqlUpdateQuery="update employee_details set country='Kashmir' where customer_name='vansh' ";
		Statement statement=connection.createStatement();
		
		//execute the query.
		
		int rowAffected=statement.executeUpdate(sqlUpdateQuery);
		System.out.println("total row affected is : "+rowAffected);
		
		//closing the resources.
		
		statement.close();
		connection.close();
		
		System.out.println("resources is closed...");

	}

}
