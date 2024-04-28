import java.util.Scanner;
public class MultipleTryAndCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println(" execution starts");
			Scanner sc=new Scanner(System.in);
			int num=sc.nextInt();
			int divide =5/num;
			System.out.println(divide);
			try{
				int [] arr=new int [1];
				System.out.println(arr[5]);
			}
			catch(ArithmeticException ae){
				System.out.println("  i am inner catch block present inside the try block");
			}
		}
		catch(Exception e) {
			System.out.println("you are learning");
			try {
				Scanner sc=new Scanner(System.in);
				int num=sc.nextInt();
				int []arr=new int [num];
				System.out.println(arr[6]);
			}
			catch(ArrayIndexOutOfBoundsException ae) {
				System.out.println("inner catch block present inside the catch block ");
			}
		}
		finally {
			System.out.println("sir ! program is terminated");
			try {
				int a=-2;
				int []arr=new int [a];
				System.out.println(arr[0]);
				System.out.println(arr);
			}
			catch(ArithmeticException ae) {
				System.out.println("i am inner catch block present inside the finally block");
			}
			
		}
		System.out.println("i am end");
	}

}
