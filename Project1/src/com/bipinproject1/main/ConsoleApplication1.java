package com.bipinproject1.main;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import com.JdbcUtil.in.MyJdbcUtilityClass;

public class ConsoleApplication1 {
	public static void main(String[] args) throws SQLException, IOException {
		Scanner scanner =new Scanner(System.in);
		
		//logic for choosing the operation .
		int choice;
		do {
			menu(scanner);
			System.out.println();
			System.out.println("please! enter the number for above  operation : ");
			choice=scanner.nextInt();
			switch(choice) {
			
			case 1:
				System.out.println("welocom the world of insertion..");
				System.out.println();
				insertRecord(scanner);
				break;
			
			case 2:
				System.out.println("welcome the world of selection..");
				System.out.println();
				selectRecord(scanner);
				break;
			case 3:
				System.out.println("welcome the world of updation..");
				System.out.println();
				updateRecord(scanner);
				break;
			case 4:
				System.out.println("welocom the world of deletion..");
				System.out.println();
				deleteRecord(scanner);
				break;
			case 5:System.out.println("operation are existing...");
			System.out.println();
			break;
			default:System.out.println("!invalid input for operations");
			}
		}while(choice!=5);
		scanner.close();
	}
		public static void menu(Scanner scanner) {
			System.out.println("hey! welcome here ");
			System.out.println();
			System.out.println("press 1 for insert operation ");
			System.out.println("press 2 for select operation ");
			System.out.println("press 3 for update operation ");
			System.out.println("press 4 for delete operation ");
			System.out.println("press 5 for exit the  operation ");
		}
		
	//	1  //insertion operation logic.
		
		public static void insertRecord(Scanner scanner) throws SQLException, IOException {
			Connection connection=null;
			PreparedStatement preparedStatement=null;
			try {
			connection =MyJdbcUtilityClass.getJdbcConnection();
			if(connection!=null) {
				String insertSqlQuery="insert into student_details(`student_Id`,`student_Name`,`student_MotherName`,`student_FatherName`,`student_Age`,`student_Gender`,`student_Address`,`student_Course`,`student_College`)VALUES(?,?,?,?,?,?,?,?,?)";
				preparedStatement=connection.prepareStatement(insertSqlQuery);
			}
			if(preparedStatement!=null) {
				System.out.println("enter the student id :");
				int sId=scanner.nextInt();
				scanner.nextLine();
				if(sId<100) {
					System.out.println("enter the student name : ");
					String sName =scanner.next();
					System.out.println("enter the student mother name  : ");
					String mName =scanner.next();
					System.out.println("enter the student father  name : ");
					String fName =scanner.next();
					System.out.println("enter the student age : ");
					int sAge =scanner.nextInt();
					System.out.println("enter the student gender : ");
					String sGender =scanner.next();
					System.out.println("enter the student address : ");
					String sAddress=scanner.next();
					System.out.println("enter the student course : ");
					String sCourse =scanner.next();
					System.out.println("enter the student college : ");
					String sCollege =scanner.next();
					preparedStatement.setInt(1, sId);
					preparedStatement.setString(2, sName);
					preparedStatement.setString(3, mName);
					preparedStatement.setString(4, fName);
					preparedStatement.setInt(5, sAge);
					preparedStatement.setString(6, sGender);
					preparedStatement.setString(7, sAddress);
					preparedStatement.setString(8, sCourse);
					preparedStatement.setString(9, sCollege);
					int rowAffected=preparedStatement.executeUpdate();
					if(rowAffected!=0) {
						System.out.println("record inserted successfully...");
					}else {
						System.out.println("!record insertion operation failed..");
					}
					
				}else {
					System.out.println("Sorry! you can only give student id till 1 to 100 ");
				}
			  }
			}catch(SQLException se) {
				se.printStackTrace();
			}catch(IOException ie) {
				ie.printStackTrace();
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				MyJdbcUtilityClass.cleanUP(preparedStatement, connection, null);	
			}
			
		}
		
	// 2 //select operation logic.
		
		public static void selectRecord(Scanner scanner) throws SQLException, IOException {
			Connection connection=null;
			PreparedStatement preparedStatement=null;
			ResultSet resultSet=null;
			try {
				connection=MyJdbcUtilityClass.getJdbcConnection();
				if(connection!=null) {
					String sqlSelectQuery="select student_Id,student_Name,student_MotherName,student_FatherName,student_Age,student_Gender,student_Address,student_Course,student_College from student_details where student_Id=?";
					preparedStatement=connection.prepareStatement(sqlSelectQuery);
					if(preparedStatement!=null) {
						System.out.println("enter the student id : ");
						int student_Id=scanner.nextInt();
						preparedStatement.setInt(1, student_Id);
					  resultSet=preparedStatement.executeQuery();
					if(resultSet!=null) {
						while(resultSet.next()) {
							System.out.println("STUDENT_ID STUDENT_NAME STUDENT_MOTHERNAME STUDENT_FATHERNAME STUDENT_AGE STUDENT_GENDER STUDENT_ADDRESS STUDENT_COURSE STUDENT_COLLEGE");	
							int sId=resultSet.getInt(1);
							String sName=resultSet.getString(2);
							String sMotherName=resultSet.getString(3);
							String sFatherName=resultSet.getString(4);
							int sAge=resultSet.getInt(5);
							String sGender=resultSet.getString(6);
							String sAddress=resultSet.getString(7);
							String sCollege=resultSet.getString(8);
							System.out.println(sId+"\t"+sName+"\t"+sMotherName+"\t"+sFatherName+"\t"+sAge+"\t"+sGender+"\t"+sAddress+"\t"+sCollege);
						}
					}else {		
						System.out.println("student is not available with this id : ");
					}
				  }
				}
			}catch(SQLException se) {
				se.printStackTrace();
			}catch(IOException ie) {
				ie.printStackTrace();
			}
			MyJdbcUtilityClass.cleanUP(preparedStatement, connection, resultSet);			
		}
		
		//updation logic.
		
		public static void updateRecord(Scanner scanner) {
			System.out.println("enter the student id where you want to update the record");
			int student_Id=scanner.nextInt();
			System.out.println("enter the student new  name : ");
			String student_Name =scanner.next();
			System.out.println("enter the student new  mother name  : ");
			String student_MotherName =scanner.next();
			System.out.println("enter the student new father  name : ");
			String student_FatherName =scanner.next();
			System.out.println("enter the student new age : ");
			int  student_Age =scanner.nextInt();
			System.out.println("enter the student new gender : ");
			String  student_Gender =scanner.next();
			System.out.println("enter the student new address : ");
			String student_Address=scanner.next();
			System.out.println("enter the  student new course : ");
			String student_Course =scanner.next();
			System.out.println("enter the  student new college : ");
			String student_College=scanner.next();
			Connection connection=null;
			PreparedStatement preparedStatement=null;
			try {
				connection=MyJdbcUtilityClass.getJdbcConnection();
				if(connection!=null) {
					String sqlUpdateQuery="update student_details set student_Name=?,student_MotherName=?,student_FatherName=?,student_Age=?,student_Gender=?,student_Address=?,student_Course=?,student_College=? where student_Id=?";
					preparedStatement=connection.prepareStatement(sqlUpdateQuery);
				}
				if(preparedStatement!=null) {
				preparedStatement.setString(1, student_Name);
				preparedStatement.setString(2, student_MotherName);
				preparedStatement.setString(3, student_FatherName);
				preparedStatement.setInt(4, student_Age);
				preparedStatement.setString(5, student_Gender);
				preparedStatement.setString(6, student_Address);
				preparedStatement.setString(7, student_Course);
				preparedStatement.setString(8, student_College);
				preparedStatement.setInt(9, student_Id);
				int rowAffected=preparedStatement.executeUpdate();
				if(rowAffected!=0) {
					System.out.println("record updation is successful...");
				}else {
					System.out.println("!in given id record is not available");
				}
			  }
			}catch(SQLException se) {
				se.printStackTrace();
			}catch(IOException ie) {
				ie.printStackTrace();
			}
			try {
				
				MyJdbcUtilityClass.cleanUP(preparedStatement, connection, null);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		
		//deletion operation logic.
		
		public static void deleteRecord(Scanner scanner) throws IOException {
			System.out.println("enter the student id where you want to delete the record ");
			int student_Id=scanner.nextInt();
			Connection connection=null;
			PreparedStatement preparedStatement=null;
			try {
				connection=MyJdbcUtilityClass.getJdbcConnection();
				if(connection!=null) {
					String sqlDeleteQuery="delete from student_details where student_Id=?";
					preparedStatement=connection.prepareStatement(sqlDeleteQuery);
				}
				if(preparedStatement!=null) {
					preparedStatement.setInt(1,student_Id);
					int rowAffected=preparedStatement.executeUpdate();
					if(rowAffected!=0) {
						System.out.println("record deletion successfully...");
					}else {
						System.out.println("! record not available for this id ");
					}
				}
				
			}catch(SQLException se){
				se.printStackTrace();
			}catch(IOException ie) {
				ie.printStackTrace();
			}
			try {
				MyJdbcUtilityClass.cleanUP(preparedStatement, connection, null);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
}
		
