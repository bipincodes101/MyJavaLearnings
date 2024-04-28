import java.util.Scanner;

class Demo{
	public static void display() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first number:");
		int a=sc.nextInt();
		System.out.println("enter the second number:");
		int b=sc.nextInt();
		
		int c=a/b;
		System.out.println("your result is:"+c);
	}
}
public class Launch4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d=new Demo();
		d.display();
	}

}
