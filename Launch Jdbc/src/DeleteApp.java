import java.sql.*;
public class DeleteApp {

	public static void main(String[] args)throws ClassNotFoundException,SQLException {
		// TODO Auto-generated method stub
		//step:->1 register and load the Driver.
		
		Class.forName("com.mysql.cj.jdbc.Driver");//its not mandatory to load because jvm auto load this.
		System.out.println("driver is loaded");
		
		//step:->2 connect through database.
		
		String url="jdbc:mysql:/employee";
		String userName="root";
		String password="bipin@123";
		Connection connection=DriverManager.getConnection(url,userName,password);
		System.out.println("connection object is created...");
		
		//step:3-> create statement object and execute query.
		String sqlDeleteQuery="delete from employee_details where country='india' ";
		Statement statement =connection.createStatement();
		System.out.println("Statement object is created....");
		int rowAffected =statement.executeUpdate(sqlDeleteQuery);
		System.out.println("total row affected is : "+rowAffected);
		
	
		statement.close();
		connection.close();
		System.out.println("data is updated");
	}

}
