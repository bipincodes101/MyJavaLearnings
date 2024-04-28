import java.util.Scanner;
//if no exception handler present in the class then exception object is propagated to caller if excetion handler is present then program execute otherwise program goto jvm and then default exception handler and default exception handler give specific error msg.but if exception handler present inside the class then program not automatically propagated to caller method.
class Peter{
	void show() {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a number");
	int a=sc.nextInt();
	int divide=30/a;
	System.out.println("prgoram is terminated");
   }
}

public class Launch7 {

	public static void main(String[] args) {
		try {
			Peter p=new Peter();
			p.show();
		}
		catch(ArithmeticException ae) {
			System.out.println("exception caught in main method");
		}
		
	}

}
