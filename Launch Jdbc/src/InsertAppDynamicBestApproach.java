import java.util.*;
import java.sql.*;	
public class InsertAppDynamicBestApproach {

	public static void main(String[] args)throws ClassNotFoundException,SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("driver is loaded...");
		
		String url="jdbc:mysql:/employee";
		String userName="root";
		String password="bipin@123";
		Connection connection =DriverManager.getConnection(url,userName,password);
		Scanner scanner =new Scanner(System.in);
		System.out.println("enter the customer name : ");
		String costumer_name=scanner.nextLine();
		System.out.println("enter the contant_name : ");
		String contact_name =scanner.nextLine();
		System.out.println("enter the address : ");
		String address=scanner.nextLine();
		System.out.println("enter the city  : ");
		String city=scanner.nextLine();
		System.out.println("enter the postal code : ");
		int postal_code=scanner.nextInt();
		System.out.println("enter the country name : ");
		String country =scanner.next();
		String insertSqlQuery=String.format("insert into employee_details(`customer_name`,`contact_name`,`address`,`city`,`postal_code`,`country`) values('%s','%s','%s','%s','%d' ,'%s')",costumer_name,contact_name,address,city,postal_code,country);
		Statement statement=connection.createStatement();
		int rowAffected=statement.executeUpdate(insertSqlQuery
		);
		System.out.println("total row affected is : "+rowAffected);
		statement.close();
		scanner.close();
		connection.close();
		System.out.println("resources is closed..");
	}

}
