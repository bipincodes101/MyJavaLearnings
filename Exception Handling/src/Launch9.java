import java.util.Scanner;
class Namay{
	void show() throws ArithmeticException {//ducking the exception and indication to the caller.
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the number:");
			int num=sc.nextInt();
			int divide =30/num;
		}
		catch(ArithmeticException ae) {
			
			System.out.println("problem caught in show method");
			throw ae;//before the throw the exceptionObject finally block get executed.
		}
		finally {
			System.out.println("program is terminated");
		}
		
		
	}
}
class Shivay  {
	void display()throws ArithmeticException{
	try {
			Namay n=new Namay();
			n.show();
	}
	catch(ArithmeticException ae) {
		System.out.println("problem caught in display method");
		throw ae;
	}
	
	}
}
public class Launch9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Shivay s=new Shivay();
			s.display();
		}
		catch(ArithmeticException ae) {
			System.out.println("program caught in main method");
		}
		
	}

}
