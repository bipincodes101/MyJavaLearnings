import java.util.Scanner;
class Bipin{
	public void show() {
		try {
			System.out.println("outer try block");
			//nested try
			try {
				Scanner sc=new Scanner (System.in);
				System.out.println("enter a number");
				int a=sc.nextInt();
				int divide=12/a;
				int []arr=new int[3];
				System.out.println(arr[8]);
				System.out.println("hello");
			}
			catch(ArithmeticException ae) {
				System.out.println("value must be greater then 0");
			}
			
		}
			catch(Exception ae) {
			System.out.println("outer catch");
		}
			finally {
				System.out.println("program is terminated");
			}
		
	}
}
public class NestedTryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bipin d=new Bipin();
		d.show();
	}

}
