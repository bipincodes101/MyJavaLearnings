import java.util.Scanner;

class Demo1{
	void display() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		int num=sc.nextInt();
		int divide=20/num;
		System.out.println("program is terminated");
	}
}
class Demo2{
	void display() {
		try{
			Demo1 d1=new Demo1();
			d1.display();
		}
		catch (ArithmeticException ae) {
			System.out.println("exception is got on Demo2 class");
		}
		
		
	}
}
public class Launch5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo2 d2=new Demo2();
		d2.display();
	}

}
