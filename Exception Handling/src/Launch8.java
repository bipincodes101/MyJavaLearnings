import java.util.Scanner;
class Bipin1{
	Scanner sc=new Scanner(System.in);
	void show() {
		
		try {
			int a=sc.nextInt();
			int divide=30/a;
			
		}
		catch(ArithmeticException ae) {
			System.out.println("exception handled in show method");
		throw ae;//re thrown the exception to the caller.
		}
		finally {//this line is first executed then mettor goto caller catch block.
			System.out.println("program is terminated");
		}
		
	}
}
public class Launch8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Bipin1 b=new Bipin1();
			b.show();
		}
		catch(ArithmeticException ae) {
			System.out.println("exception handled in main");
		}
		
	}

}
