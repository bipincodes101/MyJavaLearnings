import java.sql.*;
import java.util.*;
public class InsertAppDynamic2 {

	public static void main(String[] args) throws ClassNotFoundException,SQLException{
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver is loaded successfully");
		String url="jdbc:mysql:/employee";
		String userName="root";
		String password="bipin@123";
		Connection connection=DriverManager.getConnection(url,userName,password);
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the coustome name : ");
		String customer_name=sc.next();
		System.out.println("enter the contact name : ");
		String contact_name =sc.next();
		System.out.println("enter the addres : ");
		String address=sc.next();
		System.out.println("enter the city : ");
		String city=sc.next();
		System.out.println("enter the postal code : ");
		int postal_code=sc.nextInt();
		System.out.println("enter the country name : ");
		String country=sc.next();
		customer_name= " '"+customer_name+"' ";
		contact_name="'"+contact_name+"'";
		address ="'"+address+"'";
		city ="'"+city+"'";
		country ="'"+country+"'";
		String insertSqlQuery="insert into employee_details values(" +customer_name+ ","+contact_name+","+address+","+city+","+postal_code+","+country+")";
		System.out.println(insertSqlQuery);
		Statement statement=connection.createStatement();
		int rowAffected=statement.executeUpdate(insertSqlQuery);
		System.out.println("row affectes is : "+rowAffected);
		statement.close();
		sc.close();
		connection.close();
	}

}
