import java.sql.*;
public class Test2 {

	public static void main(String[] args) {
		Connection connection=null;
		Statement statement=null;
		ResultSet resultSet=null;
		
		try {
			//step: 1 load and register the driver.
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("driver is loaded");
			
			//step: 2 make connection with database.
			
			String url="jdbc:mysql:/employee";
			String userName="root";
			String password="bipin@123";
			connection=DriverManager.getConnection(url,userName,password);
			System.out.println("connetion is succesfully established");
			
			//step: 3 create statement object and send the query.
			
			String sqlSelectQuery=("select customer_name,contact_name,address,city,postal_code,country from employee_details");
			statement=connection.createStatement();
			System.out.println("statement is created");
			
			resultSet=statement.executeQuery(sqlSelectQuery);
			
			//step: 4 process the result.
			
			while(resultSet.next()) {
				String customer_name=resultSet.getString(1);
				String contact_name=resultSet.getString(2);
				String address=resultSet.getString(3);
				String city=resultSet.getString(4);
				int postal_code=resultSet.getInt(5);
				String country=resultSet.getString(6);
				
				System.out.println(customer_name+"\t"+contact_name+"\t"+address+"\t"+city+"\t"+postal_code+"\t"+country);
				
			}
		}
		catch(ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
		}catch(SQLException se) {
			se.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(connection!=null) {
					connection.close();
				}
			}
				catch(SQLException se) {
					se.printStackTrace();
				}
			}
		}
		
	}
