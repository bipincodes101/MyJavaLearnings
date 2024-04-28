import java.util.Scanner;
class Alpha{
	Scanner sc=new Scanner(System.in);
	void show() throws Exception {
		System.out.println("enter the number:");
		int a=sc.nextInt();
		int divide=40/a;
		System.out.println("program is terminated");
	}
}
class Beta{
	void show() throws Exception{
		Alpha a1=new Alpha();
		a1.show();
	}
}
public class Launch6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Beta b2=new Beta();
			try {
				b2.show();
			} catch (Exception e) {
				System.out.println("exception got in main method");
			}
		}
		
		
	}


