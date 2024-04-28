import java.util.Scanner;
public class Launch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int result = -1;
		System.out.println("enter first number:");
		int num1=sc.nextInt();
		System.out.println("enter the second number:");
		int num2=sc.nextInt();
		try {
			 result =num1/num2;
		}
		catch(Exception e){
			System.out.println("you entered wrong denomenator! please check and try again!");
		}
		System.out.println("  result is "+result);
	}

}
