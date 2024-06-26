import java.util.*;
import java.sql.*;
public class DeleteAppDynamicInput {
	public static void main(String[] args)throws ClassNotFoundException,SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver is loaded..");
		String url="jdbc:mysql:/employee";
		String userName="root";
		String password="bipin@123";
		Connection connection=DriverManager.getConnection(url,userName,password);
		System.out.println("connected with database successfully");
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the customer_name : ");
		String customer_name=scanner.next();
		String deleteSqlQuery=String.format("delete from employee_details where customer_name ='%s' ", customer_name); 
		System.out.println(deleteSqlQuery);
		Statement statement=connection.createStatement();
		int rowAffected=statement.executeUpdate(deleteSqlQuery);
		System.out.println("total row affected : "+rowAffected);
		statement.close();
		scanner.close();
		connection.close();
	}

}
