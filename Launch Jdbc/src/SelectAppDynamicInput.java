import java.sql.*;
import java.util.*;
public class SelectAppDynamicInput {
	public static void main(String[] args) throws ClassNotFoundException,SQLException{
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("driver is loaded...");
		String url="jdbc:mysql:/employee";
		String userName="root";
		String password="bipin@123";
		Connection connection=DriverManager.getConnection(url,userName,password);
		Scanner scanner=new Scanner(System.in);
		System.ou
	}

}
