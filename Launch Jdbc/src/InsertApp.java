import java.sql.*;
public class InsertApp {

	public static void main(String[] args) throws ClassNotFoundException,SQLException{
		// TODO Auto-generated method stub
		
		//step:->1 first register and load the Driver.
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver is loaded...");
		
		//step:2->connect with database.
		
		String url="jdbc:mysql:/employee";
		String userName="root";
		String password="bipin@123";
		Connection connection=DriverManager.getConnection(url,userName,password);
		System.out.println("database is connected...");
		
		//step:3->create the Statement object and execute the query.
		
		String insertSqlQuery="insert into employee_details(`customer_name`,`contact_name`,`address`,`city`,`postal_code`,`country`)values('james','jamesEngineer','NewYork','SiliconValley','19999','America')";
		Statement statement=connection.createStatement();
		
		int rowAffected=statement.executeUpdate(insertSqlQuery);
		System.out.println("no of row affected is "+rowAffected);
		
		//step:4->closing the resource.
		statement.close();
		connection.close();
		System.out.println("resources is closed...");
	}

}
