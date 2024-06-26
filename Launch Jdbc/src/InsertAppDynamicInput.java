import java.sql.*;
import java.util.*;
public class InsertAppDynamicInput {
//this is first approach to dynamic input.
	public static void main(String[] args)throws ClassNotFoundException ,SQLException{
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver loaded successfully..");
		String url="jdbc:mysql:/employee";
		String userName="root";
		String password="bipin@123";
		Connection connection =DriverManager.getConnection(url,userName,password);
		System.out.println("this is connected to database..");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the customer name: ");
		String customer_name=sc.nextLine();
		System.out.println("enter the contact name : ");
		String contact_name=sc.nextLine();
		System.out.println("enter the address : ");
		String address=sc.nextLine();
		System.out.println("entre the city : ");
		String city=sc.nextLine();
		System.out.println("enter the postal code : ");
		int postal_code=sc.nextInt();
		System.out.println("entry the country : ");
		String country=sc.next();
		String inserSqlQuery="insert into employee_details(`customer_name`,`contact_name`,`address`,`city`,`postal_code`,`country`) values ('"+customer_name+"',' "+contact_name+" ',' "+address+" ',' "+city+" ', "+postal_code+",' "+country+" ' ) ";
		System.out.println(inserSqlQuery);
		Statement statement=connection.createStatement();
		int rowAffected=statement.executeUpdate(inserSqlQuery);
		System.out.println("row affected is : "+rowAffected);
		
		statement.close();
		connection.close();
		System.out.println("resource is closed..");
		
				
	}

}
